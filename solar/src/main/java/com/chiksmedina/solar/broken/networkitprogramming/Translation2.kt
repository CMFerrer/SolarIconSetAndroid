package com.chiksmedina.solar.broken.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Translation2: ImageVector
    get() {
        if (_translation2 != null) {
            return _translation2!!
        }
        _translation2 = Builder(
            name = "Translation2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                curveTo(6.0f, 13.6569f, 6.6716f, 15.1569f, 7.7574f, 16.2426f)
                moveTo(16.2426f, 16.2426f)
                curveTo(17.3284f, 15.1569f, 18.0f, 13.6569f, 18.0f, 12.0f)
                curveTo(18.0f, 10.7733f, 17.6318f, 9.6325f, 17.0f, 8.6822f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7614f, 20.8807f, 17.2614f, 19.0711f, 19.0711f)
                moveTo(4.9289f, 19.0711f)
                curveTo(3.1193f, 17.2614f, 2.0f, 14.7614f, 2.0f, 12.0f)
                curveTo(2.0f, 8.2986f, 4.011f, 5.0669f, 7.0f, 3.3378f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.8874f, 17.3441f)
                curveTo(10.8467f, 16.4683f, 11.3264f, 16.0304f, 11.9187f, 16.002f)
                curveTo(11.9729f, 15.9993f, 12.0271f, 15.9993f, 12.0813f, 16.002f)
                curveTo(12.6736f, 16.0304f, 13.1533f, 16.4683f, 14.1126f, 17.3441f)
                curveTo(16.2001f, 19.2497f, 17.2439f, 20.2025f, 16.9517f, 21.0245f)
                curveTo(16.9266f, 21.0952f, 16.8954f, 21.1639f, 16.8584f, 21.2301f)
                curveTo(16.4282f, 22.0f, 14.9522f, 22.0f, 12.0f, 22.0f)
                curveTo(9.0478f, 22.0f, 7.5718f, 22.0f, 7.1416f, 21.2301f)
                curveTo(7.1046f, 21.1639f, 7.0734f, 21.0952f, 7.0483f, 21.0245f)
                curveTo(6.7561f, 20.2025f, 7.7999f, 19.2497f, 9.8874f, 17.3441f)
                close()
            }
        }
            .build()
        return _translation2!!
    }

private var _translation2: ImageVector? = null
