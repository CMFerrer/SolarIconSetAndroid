package com.chiksmedina.solar.lineduotone.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.NatureTravelGroup

val NatureTravelGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(
            name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.3588f, 21.7512f)
                curveTo(17.3819f, 21.1216f, 20.0f, 19.2547f, 20.0f, 15.0002f)
                curveTo(20.0f, 10.3783f, 14.9439f, 5.4141f, 11.5727f, 2.846f)
                curveTo(11.0161f, 2.422f, 10.2157f, 2.7273f, 9.956f, 3.3771f)
                curveTo(8.3103f, 7.495f, 4.0f, 11.8538f, 4.0f, 15.0002f)
                curveTo(4.0f, 18.1071f, 6.2456f, 20.309f, 8.0814f, 21.3717f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.3588f, 21.751f)
                curveTo(14.9274f, 21.8852f, 14.6438f, 21.3823f, 14.9019f, 21.0114f)
                curveTo(15.7823f, 19.7462f, 16.8001f, 17.8163f, 16.8001f, 16.0004f)
                curveTo(16.8001f, 14.0498f, 15.156f, 11.7469f, 13.8722f, 10.3265f)
                curveTo(13.5787f, 10.0018f, 13.0667f, 10.2167f, 13.0507f, 10.6541f)
                curveTo(12.9977f, 12.1033f, 12.769f, 14.0422f, 11.7829f, 15.5618f)
                curveTo(11.6242f, 15.8064f, 11.2872f, 15.8266f, 11.1064f, 15.5979f)
                curveTo(10.7983f, 15.2083f, 10.4901f, 14.7269f, 10.182f, 14.3466f)
                curveTo(10.0161f, 14.1418f, 9.7161f, 14.139f, 9.5247f, 14.3202f)
                curveTo(8.7783f, 15.0269f, 7.7334f, 16.129f, 7.7334f, 17.5004f)
                curveTo(7.7334f, 18.4897f, 8.2048f, 19.7206f, 8.6908f, 20.674f)
                curveTo(8.9115f, 21.107f, 8.502f, 21.615f, 8.0814f, 21.3715f)
            }
        }
            .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
