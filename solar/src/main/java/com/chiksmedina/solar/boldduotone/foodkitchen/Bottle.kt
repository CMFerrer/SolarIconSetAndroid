package com.chiksmedina.solar.boldduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.FoodKitchenGroup

public val FoodKitchenGroup.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(name = "Bottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1556f, 3.3174f)
                lineTo(18.3344f, 4.6299f)
                lineTo(18.617f, 8.1579f)
                curveTo(18.6247f, 8.2541f, 18.6286f, 8.3022f, 18.6315f, 8.3478f)
                curveTo(18.737f, 10.0069f, 18.0957f, 11.6201f, 16.8963f, 12.7129f)
                curveTo(16.8633f, 12.743f, 16.8279f, 12.7741f, 16.7572f, 12.8363f)
                curveTo(16.6885f, 12.8968f, 16.6541f, 12.9271f, 16.6208f, 12.9571f)
                curveTo(15.4234f, 14.0356f, 14.576f, 15.4739f, 14.1945f, 17.0755f)
                curveTo(14.1839f, 17.12f, 14.1735f, 17.1656f, 14.1528f, 17.257f)
                lineTo(13.9018f, 18.365f)
                curveTo(13.5684f, 19.8367f, 13.4016f, 20.5725f, 13.0506f, 21.0359f)
                curveTo(12.5153f, 21.7423f, 11.6734f, 22.1191f, 10.8113f, 22.0382f)
                curveTo(10.2458f, 21.9851f, 9.6161f, 21.6057f, 8.3567f, 20.847f)
                lineTo(7.6841f, 20.4419f)
                curveTo(6.4247f, 19.6832f, 5.795f, 19.3039f, 5.4682f, 18.8195f)
                curveTo(4.9699f, 18.0809f, 4.8617f, 17.1317f, 5.1804f, 16.2949f)
                curveTo(5.3895f, 15.746f, 5.9169f, 15.2274f, 6.9717f, 14.1903f)
                lineTo(7.7658f, 13.4094f)
                curveTo(7.8313f, 13.345f, 7.864f, 13.3129f, 7.8956f, 13.281f)
                curveTo(9.0342f, 12.1355f, 9.8043f, 10.6507f, 10.1008f, 9.0294f)
                curveTo(10.109f, 8.9844f, 10.117f, 8.9382f, 10.1328f, 8.8457f)
                curveTo(10.1491f, 8.7508f, 10.1572f, 8.7033f, 10.1657f, 8.6584f)
                curveTo(10.473f, 7.0282f, 11.4914f, 5.6421f, 12.9212f, 4.9079f)
                curveTo(12.9605f, 4.8877f, 13.0024f, 4.8671f, 13.0861f, 4.826f)
                lineTo(16.1556f, 3.3174f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.8963f, 12.7126f)
                curveTo(17.9626f, 11.741f, 18.5878f, 10.3581f, 18.6393f, 8.8973f)
                lineTo(17.0427f, 9.4295f)
                curveTo(16.1617f, 9.7232f, 15.1919f, 9.5502f, 14.4667f, 8.9701f)
                curveTo(13.6329f, 8.303f, 12.4872f, 8.1816f, 11.5321f, 8.6592f)
                lineTo(10.0618f, 9.3943f)
                lineTo(10.0207f, 9.4148f)
                curveTo(9.6789f, 10.8853f, 8.9433f, 12.2266f, 7.8956f, 13.2807f)
                curveTo(7.864f, 13.3125f, 7.8313f, 13.3447f, 7.7658f, 13.4091f)
                lineTo(6.9717f, 14.1899f)
                curveTo(5.9169f, 15.227f, 5.3895f, 15.7456f, 5.1804f, 16.2945f)
                curveTo(4.8617f, 17.1314f, 4.9699f, 18.0805f, 5.4682f, 18.8191f)
                curveTo(5.795f, 19.3035f, 6.4247f, 19.6828f, 7.6841f, 20.4415f)
                lineTo(8.3567f, 20.8467f)
                curveTo(9.6161f, 21.6054f, 10.2458f, 21.9847f, 10.8113f, 22.0378f)
                curveTo(11.6734f, 22.1188f, 12.5153f, 21.7419f, 13.0506f, 21.0355f)
                curveTo(13.4016f, 20.5722f, 13.5684f, 19.8363f, 13.9018f, 18.3646f)
                lineTo(14.1528f, 17.2566f)
                curveTo(14.1735f, 17.1653f, 14.1839f, 17.1196f, 14.1945f, 17.0751f)
                curveTo(14.576f, 15.4735f, 15.4234f, 14.0352f, 16.6208f, 12.9567f)
                curveTo(16.6541f, 12.9267f, 16.6885f, 12.8965f, 16.7572f, 12.836f)
                curveTo(16.8279f, 12.7737f, 16.8633f, 12.7426f, 16.8963f, 12.7126f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1553f, 3.3172f)
                lineTo(18.334f, 4.6296f)
                lineTo(18.7947f, 3.7971f)
                curveTo(18.9274f, 3.5572f, 18.9938f, 3.4372f, 18.9992f, 3.3188f)
                curveTo(19.0039f, 3.2146f, 18.9763f, 3.1114f, 18.9201f, 3.0235f)
                curveTo(18.8563f, 2.9235f, 18.7388f, 2.8528f, 18.504f, 2.7113f)
                lineTo(17.7136f, 2.2352f)
                curveTo(17.4626f, 2.084f, 17.3371f, 2.0084f, 17.2128f, 2.0009f)
                curveTo(17.1036f, 1.9944f, 16.9952f, 2.0234f, 16.9038f, 2.0837f)
                curveTo(16.7999f, 2.1522f, 16.7289f, 2.2804f, 16.5871f, 2.5368f)
                lineTo(16.1553f, 3.3172f)
                close()
            }
        }
        .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
