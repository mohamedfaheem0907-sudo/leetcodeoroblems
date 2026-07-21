var checkIfInstanceOf = function(obj, classFunction) {
    // If obj is null or undefined, it can't be an instance
    if (obj === null || obj === undefined) return false;
    // classFunction must be callable (a constructor or class)
    if (typeof classFunction !== 'function') return false;

    // Wrap primitives (e.g., 1, true, "hello") in their object counterparts
    let proto = Object.getPrototypeOf(Object(obj));

    // Walk up the prototype chain
    while (proto !== null) {
        if (proto === classFunction.prototype) return true;
        proto = Object.getPrototypeOf(proto);
    }
    return false;
};
