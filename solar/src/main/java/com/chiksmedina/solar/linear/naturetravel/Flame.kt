package com.chiksmedina.solar.linear.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.NatureTravelGroup

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
                moveTo(20.0f, 15.0002f)
                curveTo(20.0f, 19.2547f, 17.3819f, 21.1216f, 15.3588f, 21.7512f)
                curveTo(14.9274f, 21.8854f, 14.6438f, 21.3825f, 14.9019f, 21.0116f)
                curveTo(15.7823f, 19.7464f, 16.8f, 17.8161f, 16.8f, 16.0002f)
                curveTo(16.8f, 14.0496f, 15.1559f, 11.7467f, 13.8721f, 10.3263f)
                curveTo(13.5786f, 10.0016f, 13.0667f, 10.2164f, 13.0507f, 10.6539f)
                curveTo(12.9976f, 12.1031f, 12.7689f, 14.042f, 11.7828f, 15.5616f)
                curveTo(11.6241f, 15.8062f, 11.2872f, 15.8264f, 11.1063f, 15.5977f)
                curveTo(10.7982f, 15.208f, 10.4901f, 14.7267f, 10.182f, 14.3464f)
                curveTo(10.016f, 14.1416f, 9.716f, 14.1388f, 9.5246f, 14.32f)
                curveTo(8.7782f, 15.0267f, 7.7333f, 16.1288f, 7.7333f, 17.5002f)
                curveTo(7.7333f, 18.4894f, 8.2048f, 19.7208f, 8.6908f, 20.6743f)
                curveTo(8.9115f, 21.1073f, 8.502f, 21.6152f, 8.0814f, 21.3717f)
                curveTo(6.2456f, 20.309f, 4.0f, 18.1071f, 4.0f, 15.0002f)
                curveTo(4.0f, 11.8538f, 8.3103f, 7.495f, 9.956f, 3.3771f)
                curveTo(10.2157f, 2.7273f, 11.0161f, 2.422f, 11.5727f, 2.846f)
                curveTo(14.9439f, 5.4141f, 20.0f, 10.3783f, 20.0f, 15.0002f)
                close()
            }
        }
            .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
