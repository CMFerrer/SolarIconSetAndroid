package dev.chiksmedina.solar.broken.essentionalui

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
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.MenuDots: ImageVector
    get() {
        if (_menuDots != null) {
            return _menuDots!!
        }
        _menuDots = Builder(
            name = "MenuDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 14.0f)
                curveTo(6.1046f, 14.0f, 7.0f, 13.1046f, 7.0f, 12.0f)
                curveTo(7.0f, 10.8954f, 6.1046f, 10.0f, 5.0f, 10.0f)
                curveTo(3.8954f, 10.0f, 3.0f, 10.8954f, 3.0f, 12.0f)
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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 13.1046f, 20.1046f, 14.0f, 19.0f, 14.0f)
                curveTo(17.8954f, 14.0f, 17.0f, 13.1046f, 17.0f, 12.0f)
                curveTo(17.0f, 10.8954f, 17.8954f, 10.0f, 19.0f, 10.0f)
            }
        }
            .build()
        return _menuDots!!
    }

private var _menuDots: ImageVector? = null
