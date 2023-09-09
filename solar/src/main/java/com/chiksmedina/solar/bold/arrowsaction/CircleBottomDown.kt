package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.CircleBottomDown: ImageVector
    get() {
        if (_circleBottomDown != null) {
            return _circleBottomDown!!
        }
        _circleBottomDown = Builder(name = "CircleBottomDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                lineTo(2.0f, 22.0f)
                moveTo(2.0f, 22.0f)
                horizontalLineTo(8.0f)
                moveTo(2.0f, 22.0f)
                verticalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.75f, 22.0f)
                curveTo(8.75f, 22.4142f, 8.4142f, 22.75f, 8.0f, 22.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 22.75f, 1.25f, 22.4142f, 1.25f, 22.0f)
                verticalLineTo(16.0f)
                curveTo(1.25f, 15.5858f, 1.5858f, 15.25f, 2.0f, 15.25f)
                curveTo(2.4142f, 15.25f, 2.75f, 15.5858f, 2.75f, 16.0f)
                verticalLineTo(20.1893f)
                lineTo(9.4697f, 13.4697f)
                curveTo(9.7626f, 13.1768f, 10.2374f, 13.1768f, 10.5303f, 13.4697f)
                curveTo(10.8232f, 13.7626f, 10.8232f, 14.2374f, 10.5303f, 14.5303f)
                lineTo(3.8107f, 21.25f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 21.25f, 8.75f, 21.5858f, 8.75f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 12.5988f, 2.0526f, 13.1853f, 2.1535f, 13.7552f)
                curveTo(3.3246f, 13.8341f, 4.25f, 14.809f, 4.25f, 16.0f)
                verticalLineTo(16.568f)
                lineTo(8.409f, 12.409f)
                curveTo(9.2877f, 11.5303f, 10.7123f, 11.5303f, 11.591f, 12.409f)
                curveTo(12.4697f, 13.2877f, 12.4697f, 14.7123f, 11.591f, 15.591f)
                lineTo(7.432f, 19.75f)
                horizontalLineTo(8.0f)
                curveTo(9.191f, 19.75f, 10.1659f, 20.6754f, 10.2448f, 21.8465f)
                curveTo(10.8147f, 21.9474f, 11.4012f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _circleBottomDown!!
    }

private var _circleBottomDown: ImageVector? = null
