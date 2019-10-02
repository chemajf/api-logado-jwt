package com.saga.demo.jwt.util;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    private static final List<String> STRINGS = new ArrayList<>();

    private static Strings apellidos = null;

    private Strings() {
        fillStrings();
    }

    public static Strings getInstance() {
        if (apellidos != null) {
            return apellidos;
        } else {
            return new Strings();
        }
    }

    public static List<String> getStrings() {
        return STRINGS;
    }

    private static void fillStrings() {
        STRINGS.add("Lorem ipsum dolor");
        STRINGS.add("Consectetur adipiscing elit");
        STRINGS.add("Vestibulum rhoncus rutrum");
        STRINGS.add("Morbi quis urna");
        STRINGS.add("Nulla in facilisis");
        STRINGS.add("Mi nunc egestas");
        STRINGS.add("At luctus ante");
        STRINGS.add("Augue sit amet");
        STRINGS.add("Donec quis lorem");
        STRINGS.add("Vel libero fringilla");
        STRINGS.add("Interdum sed vel");
        STRINGS.add("Ligula eget lobortis");
        STRINGS.add("Eros purus congue");
        STRINGS.add("Viverra dapibus risus");
        STRINGS.add("Lacus a mi");
        STRINGS.add("Integer commodo neque");
        STRINGS.add("Vel sodales arcu");
        STRINGS.add("Nullam eu felis");
        STRINGS.add("Praesent laoreet tincidunt");
        STRINGS.add("Nec vulputate turpis");
        STRINGS.add("Ut urna risus");
        STRINGS.add("Accumsan sit amet");
        STRINGS.add("Ornare sit amet");
        STRINGS.add("Accumsan at mauris");
        STRINGS.add("Nullam quis metus");
        STRINGS.add("Non eros faucibus");
        STRINGS.add("Aenean rutrum erat");
        STRINGS.add("Quis ligula suscipit");
        STRINGS.add("Mauris tortor lacus");
        STRINGS.add("Venenatis ut nulla");
        STRINGS.add("Tincidunt pellentesque ligula");
        STRINGS.add("Nullam tincidunt efficitur");
        STRINGS.add("Ac varius velit");
        STRINGS.add("Mauris eget tincidunt");
        STRINGS.add("Vel aliquet mauris");
        STRINGS.add("Sed laoreet mollis");
        STRINGS.add("Maecenas diam elit");
        STRINGS.add("Malesuada eu lacus");
        STRINGS.add("Bibendum dapibus justo");
        STRINGS.add("Cras pulvinar egestas");
        STRINGS.add("Vivamus quis finibus");
        STRINGS.add("In rhoncus sem");
        STRINGS.add("Nullam metus turpis");
        STRINGS.add("Consectetur nec porttitor");
        STRINGS.add("Lobortis id nunc");
        STRINGS.add("Nullam erat sem");
        STRINGS.add("Viverra nec eros");
        STRINGS.add("Varius sagittis arcu");
        STRINGS.add("Praesent sollicitudin eget");
        STRINGS.add("Nisi quis dapibus");
        STRINGS.add("Suspendisse luctus posuere");
        STRINGS.add("Erat vitae porttitor");
        STRINGS.add("Aliquam nec interdum");
        STRINGS.add("Tincidunt bibendum sapien");
        STRINGS.add("Nam finibus diam");
        STRINGS.add("Ac egestas leo");
        STRINGS.add("Nam vitae justo");
        STRINGS.add("Nibh eget condimentum");
        STRINGS.add("Est lectus tristique");
        STRINGS.add("In convallis lacus");
        STRINGS.add("Massa in quam");
        STRINGS.add("In molestie lacus");
        STRINGS.add("Id consequat cursus");
        STRINGS.add("Phasellus id velit");
        STRINGS.add("Tristique diam in");
        STRINGS.add("Sed luctus ante");
        STRINGS.add("A pharetra eros");
        STRINGS.add("Nibh a suscipit");
        STRINGS.add("Odio odio auctor");
        STRINGS.add("At pretium magna");
    }
}
