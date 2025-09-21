package dev.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.Donut: ImageVector
    get() {
        if (_donut != null) {
            return _donut!!
        }
        _donut = Builder(
            name = "Donut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.9236f, 10.2072f)
                curveTo(2.8097f, 10.7872f, 2.75f, 11.3866f, 2.75f, 12.0f)
                curveTo(2.75f, 12.2264f, 2.7581f, 12.451f, 2.7741f, 12.6733f)
                curveTo(2.7952f, 12.6904f, 2.8173f, 12.7083f, 2.8404f, 12.7268f)
                curveTo(3.0606f, 12.9028f, 3.3709f, 13.1369f, 3.7319f, 13.3698f)
                curveTo(4.4894f, 13.8584f, 5.3318f, 14.25f, 6.0f, 14.25f)
                curveTo(6.4356f, 14.25f, 6.9638f, 14.0813f, 7.518f, 13.8023f)
                curveTo(7.8547f, 13.6327f, 8.1765f, 13.435f, 8.4607f, 13.2423f)
                curveTo(8.3242f, 12.8535f, 8.25f, 12.4354f, 8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 12.771f, 15.5173f, 13.4877f, 15.1183f, 14.0836f)
                curveTo(15.3411f, 14.1896f, 15.5713f, 14.25f, 15.8053f, 14.25f)
                curveTo(16.2683f, 14.25f, 16.487f, 14.0308f, 16.9218f, 13.516f)
                curveTo(16.9323f, 13.5036f, 16.9429f, 13.491f, 16.9537f, 13.4782f)
                curveTo(17.3151f, 13.0495f, 17.8429f, 12.4235f, 18.7798f, 12.28f)
                curveTo(18.6514f, 12.2408f, 18.532f, 12.1667f, 18.4368f, 12.0586f)
                curveTo(18.163f, 11.7477f, 18.1931f, 11.2738f, 18.504f, 11.0f)
                lineTo(20.182f, 9.5222f)
                curveTo(20.3764f, 9.351f, 20.6345f, 9.2986f, 20.8676f, 9.3594f)
                curveTo(20.6364f, 8.5819f, 20.3058f, 7.8473f, 19.8905f, 7.1702f)
                lineTo(19.5303f, 7.5303f)
                curveTo(19.2374f, 7.8232f, 18.7626f, 7.8232f, 18.4697f, 7.5303f)
                curveTo(18.1768f, 7.2374f, 18.1768f, 6.7626f, 18.4697f, 6.4697f)
                lineTo(18.9936f, 5.9457f)
                curveTo(17.2976f, 3.9882f, 14.7934f, 2.75f, 12.0f, 2.75f)
                curveTo(10.2299f, 2.75f, 8.576f, 3.2472f, 7.1702f, 4.1095f)
                lineTo(7.5303f, 4.4697f)
                curveTo(7.8232f, 4.7626f, 7.8232f, 5.2374f, 7.5303f, 5.5303f)
                curveTo(7.2374f, 5.8232f, 6.7626f, 5.8232f, 6.4697f, 5.5303f)
                lineTo(5.9457f, 5.0064f)
                curveTo(4.9405f, 5.8774f, 4.1249f, 6.9615f, 3.5693f, 8.1885f)
                curveTo(3.9799f, 8.1693f, 4.33f, 8.4847f, 4.3529f, 8.896f)
                lineTo(4.4316f, 10.308f)
                curveTo(4.4546f, 10.7216f, 4.138f, 11.0755f, 3.7244f, 11.0985f)
                curveTo(3.3109f, 11.1216f, 2.9569f, 10.805f, 2.9339f, 10.3914f)
                lineTo(2.9236f, 10.2072f)
                close()
                moveTo(21.1543f, 10.6647f)
                lineTo(19.4953f, 12.1257f)
                curveTo(19.4342f, 12.1795f, 19.3668f, 12.2216f, 19.2958f, 12.2521f)
                curveTo(20.0516f, 12.2809f, 20.6933f, 12.5991f, 21.1987f, 12.9798f)
                curveTo(21.2326f, 12.6578f, 21.25f, 12.3309f, 21.25f, 12.0f)
                curveTo(21.25f, 11.5465f, 21.2174f, 11.1007f, 21.1543f, 10.6647f)
                close()
                moveTo(20.8507f, 14.6969f)
                curveTo(20.4093f, 14.1984f, 19.8194f, 13.75f, 19.1842f, 13.75f)
                curveTo(18.7213f, 13.75f, 18.5026f, 13.9692f, 18.0677f, 14.484f)
                curveTo(18.0573f, 14.4964f, 18.0466f, 14.509f, 18.0359f, 14.5218f)
                curveTo(17.6254f, 15.0086f, 17.0005f, 15.75f, 15.8053f, 15.75f)
                curveTo(15.0981f, 15.75f, 14.49f, 15.4931f, 14.0034f, 15.1706f)
                curveTo(13.4238f, 15.5375f, 12.7367f, 15.75f, 12.0f, 15.75f)
                curveTo(10.9043f, 15.75f, 9.9184f, 15.2801f, 9.2327f, 14.5308f)
                curveTo(8.9222f, 14.7382f, 8.5688f, 14.9526f, 8.1925f, 15.142f)
                curveTo(7.5513f, 15.4649f, 6.7764f, 15.75f, 6.0f, 15.75f)
                curveTo(4.9874f, 15.75f, 3.9535f, 15.2623f, 3.1792f, 14.7932f)
                curveTo(4.3635f, 18.5366f, 7.8649f, 21.25f, 12.0f, 21.25f)
                curveTo(16.1705f, 21.25f, 19.6963f, 18.49f, 20.8507f, 14.6969f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(10.4697f, 3.4697f)
                curveTo(10.7626f, 3.1768f, 11.2374f, 3.1768f, 11.5303f, 3.4697f)
                lineTo(12.5303f, 4.4697f)
                curveTo(12.8232f, 4.7626f, 12.8232f, 5.2374f, 12.5303f, 5.5303f)
                curveTo(12.2374f, 5.8232f, 11.7626f, 5.8232f, 11.4697f, 5.5303f)
                lineTo(10.4697f, 4.5303f)
                curveTo(10.1768f, 4.2374f, 10.1768f, 3.7626f, 10.4697f, 3.4697f)
                close()
                moveTo(16.45f, 4.4f)
                curveTo(16.7814f, 4.6485f, 16.8485f, 5.1186f, 16.6f, 5.45f)
                lineTo(15.1f, 7.45f)
                curveTo(14.8515f, 7.7814f, 14.3814f, 7.8485f, 14.05f, 7.6f)
                curveTo(13.7186f, 7.3515f, 13.6515f, 6.8814f, 13.9f, 6.55f)
                lineTo(15.4f, 4.55f)
                curveTo(15.6485f, 4.2186f, 16.1186f, 4.1515f, 16.45f, 4.4f)
                close()
                moveTo(11.2244f, 6.8059f)
                curveTo(11.3317f, 7.206f, 11.0942f, 7.6172f, 10.6941f, 7.7244f)
                lineTo(9.3281f, 8.0905f)
                curveTo(8.928f, 8.1977f, 8.5167f, 7.9602f, 8.4095f, 7.5601f)
                curveTo(8.3023f, 7.16f, 8.5398f, 6.7488f, 8.9399f, 6.6416f)
                lineTo(10.3059f, 6.2756f)
                curveTo(10.706f, 6.1684f, 11.1172f, 6.4058f, 11.2244f, 6.8059f)
                close()
                moveTo(5.8969f, 7.1736f)
                curveTo(6.2739f, 7.0022f, 6.7186f, 7.169f, 6.89f, 7.5461f)
                lineTo(7.4752f, 8.8335f)
                curveTo(7.6466f, 9.2106f, 7.4799f, 9.6552f, 7.1028f, 9.8266f)
                curveTo(6.7257f, 9.998f, 6.2811f, 9.8313f, 6.1097f, 9.4542f)
                lineTo(5.5244f, 8.1668f)
                curveTo(5.353f, 7.7897f, 5.5198f, 7.345f, 5.8969f, 7.1736f)
                close()
                moveTo(16.6146f, 8.2273f)
                curveTo(17.0284f, 8.2079f, 17.3796f, 8.5275f, 17.399f, 8.9413f)
                lineTo(17.4654f, 10.3539f)
                curveTo(17.4849f, 10.7677f, 17.1652f, 11.1189f, 16.7515f, 11.1383f)
                curveTo(16.3377f, 11.1578f, 15.9865f, 10.8381f, 15.9671f, 10.4244f)
                lineTo(15.9007f, 9.0117f)
                curveTo(15.8812f, 8.598f, 16.2009f, 8.2468f, 16.6146f, 8.2273f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(6.9431f, 10.8949f)
                curveTo(7.2773f, 11.1396f, 7.35f, 11.6089f, 7.1054f, 11.9431f)
                lineTo(6.2701f, 13.0843f)
                curveTo(6.0255f, 13.4186f, 5.5562f, 13.4912f, 5.222f, 13.2466f)
                curveTo(4.8877f, 13.002f, 4.815f, 12.5327f, 5.0597f, 12.1984f)
                lineTo(5.8949f, 11.0572f)
                curveTo(6.1395f, 10.723f, 6.6088f, 10.6503f, 6.9431f, 10.8949f)
                close()
            }
        }
            .build()
        return _donut!!
    }

private var _donut: ImageVector? = null
