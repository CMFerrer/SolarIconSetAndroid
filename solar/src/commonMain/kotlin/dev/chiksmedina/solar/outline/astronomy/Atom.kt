package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(
            name = "Atom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.4616f, 4.0471f)
                curveTo(14.665f, 4.8695f, 15.8622f, 5.8597f, 17.0014f, 6.9988f)
                curveTo(18.1405f, 8.138f, 19.1307f, 9.3352f, 19.9531f, 10.5386f)
                curveTo(20.6542f, 9.1612f, 21.0756f, 7.8569f, 21.2062f, 6.7253f)
                curveTo(21.3709f, 5.2982f, 21.0676f, 4.2438f, 20.412f, 3.5882f)
                curveTo(19.7564f, 2.9326f, 18.702f, 2.6294f, 17.2749f, 2.794f)
                curveTo(16.1433f, 2.9246f, 14.839f, 3.346f, 13.4616f, 4.0471f)
                close()
                moveTo(20.8685f, 12.0004f)
                curveTo(21.8739f, 10.2352f, 22.514f, 8.477f, 22.6963f, 6.8973f)
                curveTo(22.8913f, 5.2069f, 22.5675f, 3.6224f, 21.4727f, 2.5275f)
                curveTo(20.3778f, 1.4327f, 18.7933f, 1.1089f, 17.103f, 1.3039f)
                curveTo(15.5233f, 1.4862f, 13.765f, 2.1263f, 11.9999f, 3.1317f)
                curveTo(10.2348f, 2.1263f, 8.4766f, 1.4863f, 6.8969f, 1.304f)
                curveTo(5.2066f, 1.109f, 3.6222f, 1.4329f, 2.5274f, 2.5277f)
                curveTo(1.4325f, 3.6225f, 1.1087f, 5.207f, 1.3037f, 6.8973f)
                curveTo(1.486f, 8.477f, 2.126f, 10.2352f, 3.1314f, 12.0004f)
                curveTo(2.1261f, 13.7654f, 1.4861f, 15.5236f, 1.3039f, 17.1032f)
                curveTo(1.1089f, 18.7935f, 1.4328f, 20.3779f, 2.5276f, 21.4727f)
                curveTo(3.6223f, 22.5675f, 5.2068f, 22.8914f, 6.897f, 22.6964f)
                curveTo(8.4767f, 22.5142f, 10.2348f, 21.8741f, 11.9999f, 20.8688f)
                curveTo(13.765f, 21.8742f, 15.5232f, 22.5143f, 17.1029f, 22.6965f)
                curveTo(18.7932f, 22.8915f, 20.3777f, 22.5677f, 21.4725f, 21.4728f)
                curveTo(22.5673f, 20.378f, 22.8911f, 18.7936f, 22.6961f, 17.1033f)
                curveTo(22.5139f, 15.5236f, 21.8738f, 13.7655f, 20.8685f, 12.0004f)
                close()
                moveTo(19.1193f, 12.0004f)
                curveTo(18.2824f, 10.6752f, 17.2141f, 9.3329f, 15.9407f, 8.0595f)
                curveTo(14.6673f, 6.7861f, 13.325f, 5.7179f, 11.9999f, 4.8809f)
                curveTo(10.6749f, 5.7178f, 9.3326f, 6.786f, 8.0593f, 8.0593f)
                curveTo(6.7859f, 9.3328f, 5.7176f, 10.6752f, 4.8807f, 12.0004f)
                curveTo(5.7176f, 13.3254f, 6.7858f, 14.6677f, 8.0591f, 15.9411f)
                curveTo(9.3325f, 17.2144f, 10.6748f, 18.2827f, 11.9999f, 19.1196f)
                curveTo(13.3251f, 18.2827f, 14.6675f, 17.2143f, 15.9409f, 15.9409f)
                curveTo(17.2142f, 14.6676f, 18.2824f, 13.3254f, 19.1193f, 12.0004f)
                close()
                moveTo(13.4616f, 19.9534f)
                curveTo(14.6651f, 19.131f, 15.8624f, 18.1408f, 17.0016f, 17.0016f)
                curveTo(18.1406f, 15.8625f, 19.1307f, 14.6654f, 19.9531f, 13.4621f)
                curveTo(20.6541f, 14.8395f, 21.0755f, 16.1437f, 21.206f, 17.2752f)
                curveTo(21.3706f, 18.7022f, 21.0674f, 19.7566f, 20.4118f, 20.4122f)
                curveTo(19.7562f, 21.0678f, 18.7018f, 21.371f, 17.2748f, 21.2064f)
                curveTo(16.1433f, 21.0758f, 14.839f, 20.6545f, 13.4616f, 19.9534f)
                close()
                moveTo(10.5381f, 19.9534f)
                curveTo(9.3347f, 19.131f, 8.1376f, 18.1408f, 6.9985f, 17.0017f)
                curveTo(5.8594f, 15.8626f, 4.8692f, 14.6655f, 4.0468f, 13.4621f)
                curveTo(3.3459f, 14.8394f, 2.9245f, 16.1436f, 2.794f, 17.2751f)
                curveTo(2.6294f, 18.7021f, 2.9326f, 19.7565f, 3.5882f, 20.4121f)
                curveTo(4.2438f, 21.0676f, 5.2982f, 21.3709f, 6.7252f, 21.2063f)
                curveTo(7.8566f, 21.0757f, 9.1608f, 20.6544f, 10.5381f, 19.9534f)
                close()
                moveTo(4.0468f, 10.5386f)
                curveTo(4.8693f, 9.3351f, 5.8595f, 8.1379f, 6.9987f, 6.9987f)
                curveTo(8.1377f, 5.8596f, 9.3348f, 4.8695f, 10.5382f, 4.0471f)
                curveTo(9.1608f, 3.3461f, 7.8566f, 2.9247f, 6.725f, 2.7942f)
                curveTo(5.298f, 2.6295f, 4.2436f, 2.9327f, 3.588f, 3.5884f)
                curveTo(2.9324f, 4.244f, 2.6292f, 5.2984f, 2.7938f, 6.7254f)
                curveTo(2.9244f, 7.8569f, 3.3458f, 9.1612f, 4.0468f, 10.5386f)
                close()
                moveTo(12.0f, 10.2502f)
                curveTo(11.0335f, 10.2502f, 10.25f, 11.0337f, 10.25f, 12.0002f)
                curveTo(10.25f, 12.9667f, 11.0335f, 13.7502f, 12.0f, 13.7502f)
                curveTo(12.9665f, 13.7502f, 13.75f, 12.9667f, 13.75f, 12.0002f)
                curveTo(13.75f, 11.0337f, 12.9665f, 10.2502f, 12.0f, 10.2502f)
                close()
                moveTo(8.75f, 12.0002f)
                curveTo(8.75f, 10.2053f, 10.2051f, 8.7502f, 12.0f, 8.7502f)
                curveTo(13.7949f, 8.7502f, 15.25f, 10.2053f, 15.25f, 12.0002f)
                curveTo(15.25f, 13.7951f, 13.7949f, 15.2502f, 12.0f, 15.2502f)
                curveTo(10.2051f, 15.2502f, 8.75f, 13.7951f, 8.75f, 12.0002f)
                close()
            }
        }
            .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
