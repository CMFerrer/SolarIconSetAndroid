package com.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoodKitchenGroup

public val FoodKitchenGroup.DonutBitten: ImageVector
    get() {
        if (_donutBitten != null) {
            return _donutBitten!!
        }
        _donutBitten = Builder(name = "DonutBitten", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.9238f, 10.2064f)
                curveTo(2.8098f, 10.7866f, 2.75f, 11.3863f, 2.75f, 12.0f)
                curveTo(2.75f, 12.2264f, 2.7581f, 12.451f, 2.7741f, 12.6733f)
                curveTo(2.7952f, 12.6904f, 2.8173f, 12.7083f, 2.8404f, 12.7268f)
                curveTo(3.0606f, 12.9028f, 3.3709f, 13.1369f, 3.7319f, 13.3698f)
                curveTo(4.4894f, 13.8584f, 5.3318f, 14.25f, 6.0f, 14.25f)
                curveTo(6.4356f, 14.25f, 6.9638f, 14.0813f, 7.518f, 13.8023f)
                curveTo(7.8547f, 13.6327f, 8.1765f, 13.435f, 8.4607f, 13.2423f)
                curveTo(8.3242f, 12.8535f, 8.25f, 12.4354f, 8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 12.7595f, 15.5242f, 13.4662f, 15.1361f, 14.0568f)
                curveTo(15.1836f, 14.0826f, 15.2334f, 14.1095f, 15.2856f, 14.1377f)
                curveTo(15.3054f, 14.1484f, 15.3255f, 14.1592f, 15.3459f, 14.1703f)
                curveTo(15.6383f, 14.3283f, 16.013f, 14.5325f, 16.3261f, 14.7866f)
                curveTo(16.9868f, 14.6782f, 17.6623f, 14.7793f, 18.216f, 15.1298f)
                curveTo(18.4093f, 14.7699f, 18.6888f, 14.4463f, 19.0327f, 14.1919f)
                curveTo(19.6351f, 13.7465f, 20.3998f, 13.5477f, 21.0993f, 13.6723f)
                curveTo(21.1983f, 13.1303f, 21.25f, 12.5715f, 21.25f, 12.0f)
                curveTo(21.25f, 11.5465f, 21.2174f, 11.1007f, 21.1543f, 10.6647f)
                lineTo(19.4953f, 12.1257f)
                curveTo(19.1845f, 12.3995f, 18.7106f, 12.3694f, 18.4368f, 12.0586f)
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
                curveTo(4.9404f, 5.8774f, 4.1248f, 6.9616f, 3.5692f, 8.1886f)
                curveTo(3.9799f, 8.1693f, 4.3302f, 8.4847f, 4.3531f, 8.8961f)
                lineTo(4.4318f, 10.3081f)
                curveTo(4.4548f, 10.7217f, 4.1382f, 11.0756f, 3.7246f, 11.0987f)
                curveTo(3.3111f, 11.1217f, 2.9571f, 10.8051f, 2.9341f, 10.3916f)
                lineTo(2.9238f, 10.2064f)
                close()
                moveTo(14.7095f, 15.5316f)
                curveTo(14.6844f, 15.5179f, 14.6587f, 15.5039f, 14.6326f, 15.4898f)
                curveTo(14.5981f, 15.4712f, 14.5623f, 15.4519f, 14.5252f, 15.4321f)
                curveTo(14.3717f, 15.3497f, 14.1982f, 15.2567f, 14.0279f, 15.1549f)
                curveTo(13.4433f, 15.5315f, 12.7472f, 15.75f, 12.0f, 15.75f)
                curveTo(10.9043f, 15.75f, 9.9184f, 15.2801f, 9.2327f, 14.5308f)
                curveTo(8.9222f, 14.7382f, 8.5688f, 14.9526f, 8.1925f, 15.142f)
                curveTo(7.5513f, 15.4649f, 6.7764f, 15.75f, 6.0f, 15.75f)
                curveTo(4.9874f, 15.75f, 3.9535f, 15.2623f, 3.1792f, 14.7932f)
                curveTo(4.3122f, 18.3744f, 7.5658f, 21.013f, 11.4663f, 21.2349f)
                curveTo(11.4162f, 20.421f, 11.77f, 19.563f, 12.498f, 19.0246f)
                curveTo(12.8438f, 18.7689f, 13.2344f, 18.5971f, 13.6339f, 18.5182f)
                curveTo(13.3438f, 17.4575f, 13.8257f, 16.275f, 14.7095f, 15.5316f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 13.0111f, 22.6102f, 13.9907f, 22.3484f, 14.9201f)
                curveTo(22.2792f, 15.1662f, 22.0893f, 15.36f, 21.8447f, 15.4343f)
                curveTo(21.6002f, 15.5087f, 21.3346f, 15.4534f, 21.14f, 15.2876f)
                curveTo(20.9259f, 15.105f, 20.4213f, 15.0306f, 19.9246f, 15.398f)
                curveTo(19.5124f, 15.7028f, 19.3792f, 16.1229f, 19.4251f, 16.3974f)
                curveTo(19.4651f, 16.6365f, 19.3871f, 16.8801f, 19.2157f, 17.0515f)
                lineTo(19.1143f, 17.153f)
                curveTo(18.9599f, 17.3073f, 18.746f, 17.3868f, 18.5283f, 17.3706f)
                curveTo(18.3106f, 17.3544f, 18.1107f, 17.2441f, 17.9809f, 17.0686f)
                lineTo(17.6465f, 16.6163f)
                curveTo(17.351f, 16.2168f, 16.5445f, 16.0321f, 15.7654f, 16.6083f)
                curveTo(14.9862f, 17.1845f, 14.9266f, 18.0097f, 15.2221f, 18.4092f)
                lineTo(15.4074f, 18.6598f)
                curveTo(15.6282f, 18.9583f, 15.5973f, 19.3735f, 15.3347f, 19.6361f)
                lineTo(15.1494f, 19.8213f)
                curveTo(14.9517f, 20.019f, 14.6605f, 20.0904f, 14.3938f, 20.0064f)
                curveTo(14.1352f, 19.9249f, 13.747f, 19.9665f, 13.3899f, 20.2306f)
                curveTo(12.9028f, 20.5909f, 12.8699f, 21.2389f, 13.103f, 21.554f)
                curveTo(13.2677f, 21.7768f, 13.2963f, 22.0721f, 13.1772f, 22.3222f)
                curveTo(13.0582f, 22.5724f, 12.811f, 22.7365f, 12.5343f, 22.7492f)
                curveTo(12.4074f, 22.755f, 12.2412f, 22.7528f, 12.1175f, 22.7512f)
                curveTo(12.0709f, 22.7505f, 12.0302f, 22.75f, 12.0f, 22.75f)
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
                moveTo(16.6145f, 8.2274f)
                curveTo(17.0283f, 8.208f, 17.3795f, 8.5276f, 17.3989f, 8.9414f)
                lineTo(17.4653f, 10.354f)
                curveTo(17.4847f, 10.7678f, 17.1651f, 11.119f, 16.7513f, 11.1384f)
                curveTo(16.3376f, 11.1579f, 15.9864f, 10.8382f, 15.967f, 10.4245f)
                lineTo(15.9006f, 9.0118f)
                curveTo(15.8811f, 8.5981f, 16.2008f, 8.2469f, 16.6145f, 8.2274f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(6.9429f, 10.8948f)
                curveTo(7.2772f, 11.1394f, 7.3499f, 11.6087f, 7.1052f, 11.9429f)
                lineTo(6.27f, 13.0842f)
                curveTo(6.0254f, 13.4184f, 5.5561f, 13.4911f, 5.2218f, 13.2464f)
                curveTo(4.8876f, 13.0018f, 4.8149f, 12.5325f, 5.0595f, 12.1983f)
                lineTo(5.8948f, 11.0571f)
                curveTo(6.1394f, 10.7228f, 6.6087f, 10.6501f, 6.9429f, 10.8948f)
                close()
            }
        }
        .build()
        return _donutBitten!!
    }

private var _donutBitten: ImageVector? = null
