package com.chiksmedina.solar.linear.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Translation: ImageVector
    get() {
        if (_translation != null) {
            return _translation!!
        }
        _translation = Builder(
            name = "Translation", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.1414f, 5.0f)
                curveTo(20.9097f, 6.8038f, 22.0f, 9.2746f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7578f, 20.8836f, 17.2549f, 19.0782f, 19.064f)
                moveTo(5.0f, 19.1415f)
                curveTo(3.1486f, 17.3265f, 2.0f, 14.7974f, 2.0f, 12.0f)
                curveTo(2.0f, 9.235f, 3.1222f, 6.7321f, 4.936f, 4.9219f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.2849f, 8.044f)
                curveTo(17.3458f, 9.0588f, 18.0f, 10.4488f, 18.0f, 11.9822f)
                curveTo(18.0f, 13.5338f, 17.3302f, 14.9386f, 16.2469f, 15.9564f)
                moveTo(7.8f, 16.0f)
                curveTo(6.6892f, 14.9789f, 6.0f, 13.556f, 6.0f, 11.9822f)
                curveTo(6.0f, 10.4266f, 6.6733f, 9.0184f, 7.7616f, 8.0f)
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
        }
            .build()
        return _translation!!
    }

private var _translation: ImageVector? = null
