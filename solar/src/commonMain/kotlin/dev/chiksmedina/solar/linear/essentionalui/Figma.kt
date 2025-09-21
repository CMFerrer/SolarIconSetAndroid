package dev.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.EssentionalUiGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                horizontalLineTo(8.6666f)
                curveTo(6.8257f, 2.0f, 5.3333f, 3.4924f, 5.3333f, 5.3333f)
                curveTo(5.3333f, 7.1743f, 6.8257f, 8.6667f, 8.6666f, 8.6667f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.6667f)
                horizontalLineTo(8.6666f)
                curveTo(6.8257f, 8.6667f, 5.3333f, 10.1591f, 5.3333f, 12.0f)
                curveTo(5.3333f, 13.841f, 6.8257f, 15.3334f, 8.6666f, 15.3334f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.6667f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.6667f, 12.0f)
                curveTo(18.6667f, 13.841f, 17.1743f, 15.3334f, 15.3333f, 15.3334f)
                curveTo(13.4924f, 15.3334f, 12.0f, 13.841f, 12.0f, 12.0f)
                curveTo(12.0f, 10.1591f, 13.4924f, 8.6667f, 15.3333f, 8.6667f)
                curveTo(17.1743f, 8.6667f, 18.6667f, 10.1591f, 18.6667f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.6666f, 15.3333f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.6666f)
                curveTo(12.0f, 20.5076f, 10.5076f, 22.0f, 8.6666f, 22.0f)
                curveTo(6.8257f, 22.0f, 5.3333f, 20.5076f, 5.3333f, 18.6666f)
                curveTo(5.3333f, 16.8257f, 6.8257f, 15.3333f, 8.6666f, 15.3333f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                horizontalLineTo(15.3333f)
                curveTo(17.1743f, 2.0f, 18.6667f, 3.4924f, 18.6667f, 5.3333f)
                curveTo(18.6667f, 7.1743f, 17.1743f, 8.6667f, 15.3333f, 8.6667f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
            .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
