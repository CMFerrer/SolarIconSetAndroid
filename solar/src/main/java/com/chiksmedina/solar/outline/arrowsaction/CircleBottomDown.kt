package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

public val ArrowsActionGroup.CircleBottomDown: ImageVector
    get() {
        if (_circleBottomDown != null) {
            return _circleBottomDown!!
        }
        _circleBottomDown = Builder(name = "CircleBottomDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(11.5858f, 21.25f, 11.25f, 21.5858f, 11.25f, 22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 12.4142f, 1.5858f, 12.75f, 2.0f, 12.75f)
                curveTo(2.4142f, 12.75f, 2.75f, 12.4142f, 2.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.75f)
                curveTo(8.4142f, 22.75f, 8.75f, 22.4142f, 8.75f, 22.0f)
                curveTo(8.75f, 21.5858f, 8.4142f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(3.8107f)
                lineTo(10.5303f, 14.5303f)
                curveTo(10.8232f, 14.2374f, 10.8232f, 13.7626f, 10.5303f, 13.4697f)
                curveTo(10.2374f, 13.1768f, 9.7626f, 13.1768f, 9.4697f, 13.4697f)
                lineTo(2.75f, 20.1893f)
                verticalLineTo(16.0f)
                curveTo(2.75f, 15.5858f, 2.4142f, 15.25f, 2.0f, 15.25f)
                curveTo(1.5858f, 15.25f, 1.25f, 15.5858f, 1.25f, 16.0f)
                verticalLineTo(22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _circleBottomDown!!
    }

private var _circleBottomDown: ImageVector? = null
