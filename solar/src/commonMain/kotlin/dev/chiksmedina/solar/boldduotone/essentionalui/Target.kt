package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(
            name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 11.5858f, 9.5858f, 11.25f, 10.0f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 11.25f, 14.75f, 11.5858f, 14.75f, 12.0f)
                curveTo(14.75f, 12.4142f, 14.4142f, 12.75f, 14.0f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                curveTo(11.5858f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 12.75f, 9.25f, 12.4142f, 9.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0277f, 12.75f)
                curveTo(2.0093f, 12.5024f, 2.0f, 12.2523f, 2.0f, 12.0f)
                curveTo(2.0f, 11.7477f, 2.0093f, 11.4976f, 2.0277f, 11.25f)
                horizontalLineTo(5.0f)
                curveTo(5.4142f, 11.25f, 5.75f, 11.5858f, 5.75f, 12.0f)
                curveTo(5.75f, 12.4142f, 5.4142f, 12.75f, 5.0f, 12.75f)
                horizontalLineTo(2.0277f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 21.9723f)
                curveTo(12.5024f, 21.9907f, 12.2523f, 22.0f, 12.0f, 22.0f)
                curveTo(11.7477f, 22.0f, 11.4976f, 21.9907f, 11.25f, 21.9723f)
                verticalLineTo(19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                curveTo(12.4142f, 18.25f, 12.75f, 18.5858f, 12.75f, 19.0f)
                verticalLineTo(21.9723f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.9723f, 11.25f)
                curveTo(21.9907f, 11.4976f, 22.0f, 11.7477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.2523f, 21.9907f, 12.5024f, 21.9723f, 12.75f)
                horizontalLineTo(19.0f)
                curveTo(18.5858f, 12.75f, 18.25f, 12.4142f, 18.25f, 12.0f)
                curveTo(18.25f, 11.5858f, 18.5858f, 11.25f, 19.0f, 11.25f)
                horizontalLineTo(21.9723f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.0277f)
                verticalLineTo(5.0f)
                curveTo(12.75f, 5.4142f, 12.4142f, 5.75f, 12.0f, 5.75f)
                curveTo(11.5858f, 5.75f, 11.25f, 5.4142f, 11.25f, 5.0f)
                verticalLineTo(2.0277f)
                curveTo(11.4976f, 2.0093f, 11.7477f, 2.0f, 12.0f, 2.0f)
                curveTo(12.2523f, 2.0f, 12.5024f, 2.0093f, 12.75f, 2.0277f)
                close()
            }
        }
            .build()
        return _target!!
    }

private var _target: ImageVector? = null
