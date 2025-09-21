package dev.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.StarFall: ImageVector
    get() {
        if (_starFall != null) {
            return _starFall!!
        }
        _starFall = Builder(
            name = "StarFall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.277f, 16.5153f)
                curveTo(10.2817f, 16.4054f, 10.4637f, 16.3618f, 10.5176f, 16.4576f)
                curveTo(10.771f, 16.9073f, 11.2031f, 17.5687f, 11.6935f, 17.8694f)
                curveTo(12.1838f, 18.1701f, 12.9692f, 18.2554f, 13.4849f, 18.2773f)
                curveTo(13.5948f, 18.282f, 13.6384f, 18.4639f, 13.5426f, 18.5179f)
                curveTo(13.0929f, 18.7712f, 12.4315f, 19.2034f, 12.1308f, 19.6937f)
                curveTo(11.8301f, 20.1841f, 11.7448f, 20.9695f, 11.7229f, 21.4851f)
                curveTo(11.7182f, 21.595f, 11.5363f, 21.6386f, 11.4823f, 21.5428f)
                curveTo(11.229f, 21.0931f, 10.7968f, 20.4318f, 10.3065f, 20.1311f)
                curveTo(9.8161f, 19.8304f, 9.0307f, 19.745f, 8.515f, 19.7232f)
                curveTo(8.4052f, 19.7185f, 8.3616f, 19.5365f, 8.4574f, 19.4825f)
                curveTo(8.9071f, 19.2292f, 9.5684f, 18.7971f, 9.8691f, 18.3067f)
                curveTo(10.1698f, 17.8164f, 10.2552f, 17.031f, 10.277f, 16.5153f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.4921f, 15.5152f)
                curveTo(18.4837f, 15.4056f, 18.2918f, 15.3596f, 18.2346f, 15.4535f)
                curveTo(18.0623f, 15.736f, 17.8138f, 16.0769f, 17.5376f, 16.2463f)
                curveTo(17.2614f, 16.4157f, 16.8449f, 16.4825f, 16.515f, 16.508f)
                curveTo(16.4053f, 16.5165f, 16.3593f, 16.7083f, 16.4532f, 16.7656f)
                curveTo(16.7357f, 16.9379f, 17.0767f, 17.1863f, 17.246f, 17.4625f)
                curveTo(17.4154f, 17.7387f, 17.4823f, 18.1552f, 17.5078f, 18.4852f)
                curveTo(17.5162f, 18.5948f, 17.7081f, 18.6408f, 17.7653f, 18.5469f)
                curveTo(17.9376f, 18.2644f, 18.1861f, 17.9234f, 18.4623f, 17.7541f)
                curveTo(18.7384f, 17.5847f, 19.155f, 17.5178f, 19.4849f, 17.4924f)
                curveTo(19.5945f, 17.4839f, 19.6405f, 17.292f, 19.5467f, 17.2348f)
                curveTo(19.2642f, 17.0625f, 18.9232f, 16.814f, 18.7538f, 16.5379f)
                curveTo(18.5845f, 16.2617f, 18.5176f, 15.8451f, 18.4921f, 15.5152f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.7037f, 4.0018f)
                lineTo(14.4614f, 3.6957f)
                curveTo(13.5247f, 2.5127f, 13.0564f, 1.9211f, 12.5115f, 2.0085f)
                curveTo(11.9667f, 2.0958f, 11.7062f, 2.8041f, 11.1851f, 4.2208f)
                lineTo(11.0503f, 4.5873f)
                curveTo(10.9023f, 4.9899f, 10.8282f, 5.1912f, 10.6862f, 5.339f)
                curveTo(10.5443f, 5.4867f, 10.3504f, 5.5642f, 9.9627f, 5.7191f)
                lineTo(9.6097f, 5.8602f)
                lineTo(9.3618f, 5.9593f)
                curveTo(8.1623f, 6.4406f, 7.5579f, 6.7133f, 7.4807f, 7.2432f)
                curveTo(7.3984f, 7.8085f, 7.9705f, 8.2921f, 9.1147f, 9.2591f)
                lineTo(9.4107f, 9.5093f)
                curveTo(9.7358f, 9.7842f, 9.8984f, 9.9216f, 9.9916f, 10.1089f)
                curveTo(10.0848f, 10.2962f, 10.0981f, 10.5121f, 10.1246f, 10.9441f)
                lineTo(10.1488f, 11.3373f)
                curveTo(10.2421f, 12.8574f, 10.2888f, 13.6174f, 10.7828f, 13.8794f)
                curveTo(11.2768f, 14.1414f, 11.8909f, 13.7319f, 13.1191f, 12.9129f)
                lineTo(13.1191f, 12.9129f)
                lineTo(13.4368f, 12.701f)
                curveTo(13.7858f, 12.4683f, 13.9603f, 12.3519f, 14.1599f, 12.32f)
                curveTo(14.3595f, 12.288f, 14.5616f, 12.344f, 14.9657f, 12.456f)
                lineTo(15.3336f, 12.558f)
                curveTo(16.7558f, 12.9522f, 17.4669f, 13.1493f, 17.8545f, 12.746f)
                curveTo(18.2421f, 12.3427f, 18.0495f, 11.6061f, 17.6644f, 10.1328f)
                lineTo(17.5647f, 9.7516f)
                curveTo(17.4553f, 9.333f, 17.4006f, 9.1236f, 17.4307f, 8.9166f)
                curveTo(17.4609f, 8.7095f, 17.5725f, 8.5282f, 17.7957f, 8.1655f)
                lineTo(17.7957f, 8.1654f)
                lineTo(17.999f, 7.8352f)
                curveTo(18.7845f, 6.5588f, 19.1773f, 5.9206f, 18.9229f, 5.4093f)
                curveTo(18.6685f, 4.8981f, 17.9354f, 4.8523f, 16.4691f, 4.7608f)
                lineTo(16.0898f, 4.7371f)
                curveTo(15.6731f, 4.7111f, 15.4648f, 4.6981f, 15.2839f, 4.6021f)
                curveTo(15.1029f, 4.5061f, 14.9698f, 4.338f, 14.7037f, 4.0018f)
                lineTo(14.7037f, 4.0018f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.835f, 13.326f)
                curveTo(6.6977f, 14.3702f, 4.9193f, 16.024f, 4.2484f, 18.0002f)
                curveTo(3.4959f, 13.2926f, 4.5398f, 10.2526f, 6.2131f, 8.3633f)
                curveTo(6.3573f, 8.658f, 6.5447f, 8.902f, 6.713f, 9.0927f)
                curveTo(7.0629f, 9.4891f, 7.5652f, 9.9135f, 8.0752f, 10.3444f)
                lineTo(8.4423f, 10.6545f)
                curveTo(8.5118f, 10.7134f, 8.566f, 10.7592f, 8.612f, 10.7989f)
                curveTo(8.6166f, 10.8632f, 8.6213f, 10.9383f, 8.6273f, 11.0357f)
                lineTo(8.6571f, 11.5212f)
                curveTo(8.6972f, 12.1761f, 8.7363f, 12.8155f, 8.835f, 13.326f)
                close()
            }
        }
            .build()
        return _starFall!!
    }

private var _starFall: ImageVector? = null
