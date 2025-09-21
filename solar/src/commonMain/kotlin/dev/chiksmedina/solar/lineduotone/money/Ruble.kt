package dev.chiksmedina.solar.lineduotone.money

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
import dev.chiksmedina.solar.lineduotone.MoneyGroup

val MoneyGroup.Ruble: ImageVector
    get() {
        if (_ruble != null) {
            return _ruble!!
        }
        _ruble = Builder(
            name = "Ruble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 14.0f)
                horizontalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 12.0f)
                verticalLineTo(8.2f)
                curveTo(10.0f, 8.0142f, 10.0f, 7.9213f, 10.0123f, 7.8436f)
                curveTo(10.0801f, 7.4157f, 10.4157f, 7.0801f, 10.8436f, 7.0123f)
                curveTo(10.9213f, 7.0f, 11.0142f, 7.0f, 11.2f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(14.8807f, 7.0f, 16.0f, 8.1193f, 16.0f, 9.5f)
                curveTo(16.0f, 10.8807f, 14.8807f, 12.0f, 13.5f, 12.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(10.0f, 12.0f)
                verticalLineTo(17.0f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(9.0f)
            }
        }
            .build()
        return _ruble!!
    }

private var _ruble: ImageVector? = null
