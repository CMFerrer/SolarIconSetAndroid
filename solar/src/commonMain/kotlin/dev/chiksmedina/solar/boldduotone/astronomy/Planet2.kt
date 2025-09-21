package dev.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Planet2: ImageVector
    get() {
        if (_planet2 != null) {
            return _planet2!!
        }
        _planet2 = Builder(
            name = "Planet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0089f, 6.7835f)
                curveTo(19.4214f, 6.7456f, 19.725f, 6.3804f, 19.687f, 5.9679f)
                curveTo(19.6491f, 5.5555f, 19.2839f, 5.2519f, 18.8714f, 5.2898f)
                curveTo(18.4476f, 5.3288f, 17.9974f, 5.3959f, 17.5264f, 5.4887f)
                curveTo(17.3268f, 5.528f, 17.1614f, 5.6432f, 17.0543f, 5.7984f)
                lineTo(18.1716f, 6.8951f)
                curveTo(18.4671f, 6.8448f, 18.7467f, 6.8077f, 19.0089f, 6.7835f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.9369f, 5.3787f)
                curveTo(20.5338f, 5.2833f, 20.1297f, 5.5326f, 20.0342f, 5.9357f)
                curveTo(19.9388f, 6.3388f, 20.1881f, 6.7429f, 20.5912f, 6.8384f)
                curveTo(20.9852f, 6.9317f, 21.137f, 7.0708f, 21.1934f, 7.1609f)
                curveTo(21.2568f, 7.2622f, 21.3265f, 7.5268f, 21.0366f, 8.1089f)
                curveTo(20.8519f, 8.4796f, 21.0027f, 8.9299f, 21.3735f, 9.1146f)
                curveTo(21.7442f, 9.2993f, 22.1945f, 9.1484f, 22.3792f, 8.7777f)
                curveTo(22.7569f, 8.0195f, 22.9424f, 7.1284f, 22.465f, 6.3653f)
                curveTo(22.1209f, 5.8152f, 21.5418f, 5.522f, 20.9369f, 5.3787f)
                close()
                moveTo(20.7121f, 10.9607f)
                curveTo(21.0039f, 10.6667f, 21.0022f, 10.1918f, 20.7083f, 9.9f)
                curveTo(20.4143f, 9.6082f, 19.9395f, 9.6099f, 19.6476f, 9.9038f)
                curveTo(18.9612f, 10.5952f, 18.08f, 11.3332f, 17.039f, 12.0748f)
                curveTo(16.7017f, 12.3152f, 16.623f, 12.7835f, 16.8634f, 13.1208f)
                curveTo(17.1037f, 13.4582f, 17.572f, 13.5368f, 17.9094f, 13.2965f)
                curveTo(19.0038f, 12.5167f, 19.9535f, 11.7247f, 20.7121f, 10.9607f)
                close()
                moveTo(3.5872f, 14.947f)
                curveTo(3.7887f, 14.6947f, 4.0245f, 14.4301f, 4.2934f, 14.1559f)
                lineTo(4.0555f, 12.8257f)
                curveTo(3.8002f, 12.7504f, 3.5128f, 12.8137f, 3.3116f, 13.0154f)
                curveTo(2.9768f, 13.3512f, 2.6762f, 13.6841f, 2.4152f, 14.0108f)
                curveTo(2.1567f, 14.3344f, 2.2095f, 14.8064f, 2.5331f, 15.0649f)
                curveTo(2.8567f, 15.3234f, 3.3287f, 15.2707f, 3.5872f, 14.947f)
                close()
                moveTo(15.7507f, 14.7035f)
                curveTo(16.1062f, 14.491f, 16.2221f, 14.0304f, 16.0095f, 13.6749f)
                curveTo(15.7969f, 13.3194f, 15.3364f, 13.2035f, 14.9809f, 13.4161f)
                curveTo(14.4993f, 13.704f, 13.9976f, 13.9877f, 13.4783f, 14.2643f)
                curveTo(12.9448f, 14.5486f, 12.4135f, 14.8144f, 11.8885f, 15.061f)
                curveTo(11.5136f, 15.2371f, 11.3524f, 15.6838f, 11.5286f, 16.0587f)
                curveTo(11.7047f, 16.4336f, 12.1514f, 16.5948f, 12.5263f, 16.4187f)
                curveTo(13.0741f, 16.1613f, 13.6279f, 15.8842f, 14.1836f, 15.5882f)
                curveTo(14.7245f, 15.3f, 15.2477f, 15.0043f, 15.7507f, 14.7035f)
                close()
                moveTo(2.815f, 16.2496f)
                curveTo(2.9408f, 15.855f, 2.7228f, 15.4331f, 2.3282f, 15.3073f)
                curveTo(1.9335f, 15.1816f, 1.5116f, 15.3996f, 1.3859f, 15.7942f)
                curveTo(1.1942f, 16.3958f, 1.1738f, 17.0568f, 1.5351f, 17.6344f)
                curveTo(1.988f, 18.3582f, 2.8418f, 18.6408f, 3.6893f, 18.7219f)
                curveTo(4.1017f, 18.7614f, 4.4679f, 18.4591f, 4.5074f, 18.0468f)
                curveTo(4.5468f, 17.6345f, 4.2446f, 17.2682f, 3.8322f, 17.2288f)
                curveTo(3.1379f, 17.1623f, 2.8838f, 16.9619f, 2.8068f, 16.8388f)
                curveTo(2.757f, 16.7593f, 2.705f, 16.5949f, 2.815f, 16.2496f)
                close()
                moveTo(10.0832f, 17.4524f)
                curveTo(10.471f, 17.3068f, 10.6674f, 16.8745f, 10.5218f, 16.4867f)
                curveTo(10.3762f, 16.0989f, 9.9438f, 15.9025f, 9.5561f, 16.0481f)
                curveTo(8.3314f, 16.5079f, 7.1911f, 16.84f, 6.1944f, 17.0372f)
                curveTo(5.7881f, 17.1176f, 5.5238f, 17.5122f, 5.6042f, 17.9185f)
                curveTo(5.6846f, 18.3248f, 6.0792f, 18.5891f, 6.4855f, 18.5087f)
                curveTo(7.5781f, 18.2925f, 8.7981f, 17.9349f, 10.0832f, 17.4524f)
                close()
            }
        }
            .build()
        return _planet2!!
    }

private var _planet2: ImageVector? = null
