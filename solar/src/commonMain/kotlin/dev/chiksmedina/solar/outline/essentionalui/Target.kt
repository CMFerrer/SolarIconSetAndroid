package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(11.25f, 2.78f)
                curveTo(6.7395f, 3.1419f, 3.1419f, 6.7395f, 2.78f, 11.25f)
                horizontalLineTo(5.0f)
                curveTo(5.4142f, 11.25f, 5.75f, 11.5858f, 5.75f, 12.0f)
                curveTo(5.75f, 12.4142f, 5.4142f, 12.75f, 5.0f, 12.75f)
                horizontalLineTo(2.78f)
                curveTo(3.1419f, 17.2605f, 6.7395f, 20.8581f, 11.25f, 21.22f)
                verticalLineTo(19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                curveTo(12.4142f, 18.25f, 12.75f, 18.5858f, 12.75f, 19.0f)
                verticalLineTo(21.22f)
                curveTo(17.2605f, 20.8581f, 20.8581f, 17.2605f, 21.22f, 12.75f)
                horizontalLineTo(19.0f)
                curveTo(18.5858f, 12.75f, 18.25f, 12.4142f, 18.25f, 12.0f)
                curveTo(18.25f, 11.5858f, 18.5858f, 11.25f, 19.0f, 11.25f)
                horizontalLineTo(21.22f)
                curveTo(20.8581f, 6.7395f, 17.2605f, 3.1419f, 12.75f, 2.78f)
                verticalLineTo(5.0f)
                curveTo(12.75f, 5.4142f, 12.4142f, 5.75f, 12.0f, 5.75f)
                curveTo(11.5858f, 5.75f, 11.25f, 5.4142f, 11.25f, 5.0f)
                verticalLineTo(2.78f)
                close()
            }
        }
            .build()
        return _target!!
    }

private var _target: ImageVector? = null
