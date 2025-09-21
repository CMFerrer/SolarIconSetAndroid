package dev.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(
            name = "Figma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.9999f, 8.6667f)
                horizontalLineTo(8.6666f)
                moveTo(11.9999f, 8.6667f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.6666f)
                curveTo(6.8256f, 2.0f, 5.3333f, 3.4924f, 5.3333f, 5.3333f)
                curveTo(5.3333f, 7.1743f, 6.8256f, 8.6667f, 8.6666f, 8.6667f)
                moveTo(11.9999f, 8.6667f)
                verticalLineTo(15.3333f)
                horizontalLineTo(8.6666f)
                moveTo(11.9999f, 8.6667f)
                lineTo(15.3333f, 8.6667f)
                moveTo(8.6666f, 8.6667f)
                curveTo(6.8256f, 8.6667f, 5.3333f, 10.1591f, 5.3333f, 12.0f)
                curveTo(5.3333f, 13.8409f, 6.8256f, 15.3333f, 8.6666f, 15.3333f)
                moveTo(8.6666f, 15.3333f)
                curveTo(6.8256f, 15.3333f, 5.3333f, 16.8257f, 5.3333f, 18.6667f)
                curveTo(5.3333f, 20.5076f, 6.8256f, 22.0f, 8.6666f, 22.0f)
                curveTo(10.5075f, 22.0f, 11.9999f, 20.5076f, 11.9999f, 18.6667f)
                moveTo(15.3333f, 8.6667f)
                curveTo(13.4923f, 8.6667f, 11.9999f, 10.1591f, 11.9999f, 12.0f)
                curveTo(11.9999f, 13.8409f, 13.4923f, 15.3333f, 15.3333f, 15.3333f)
                curveTo(17.1742f, 15.3333f, 18.6666f, 13.8409f, 18.6666f, 12.0f)
                curveTo(18.6666f, 10.1591f, 17.1742f, 8.6667f, 15.3333f, 8.6667f)
                close()
                moveTo(15.3333f, 8.6667f)
                curveTo(17.1742f, 8.6667f, 18.6666f, 7.1743f, 18.6666f, 5.3333f)
                curveTo(18.6666f, 3.4924f, 17.1742f, 2.0f, 15.3333f, 2.0f)
            }
        }
            .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
