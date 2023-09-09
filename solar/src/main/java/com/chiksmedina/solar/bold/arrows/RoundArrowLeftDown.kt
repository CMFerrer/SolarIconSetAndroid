package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

public val ArrowsGroup.RoundArrowLeftDown: ImageVector
    get() {
        if (_roundArrowLeftDown != null) {
            return _roundArrowLeftDown!!
        }
        _roundArrowLeftDown = Builder(name = "RoundArrowLeftDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.25f, 15.0f)
                curveTo(14.25f, 15.4142f, 13.9142f, 15.75f, 13.5f, 15.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 15.75f, 8.25f, 15.4142f, 8.25f, 15.0f)
                verticalLineTo(10.5f)
                curveTo(8.25f, 10.0858f, 8.5858f, 9.75f, 9.0f, 9.75f)
                curveTo(9.4142f, 9.75f, 9.75f, 10.0858f, 9.75f, 10.5f)
                verticalLineTo(13.1893f)
                lineTo(14.4697f, 8.4697f)
                curveTo(14.7626f, 8.1768f, 15.2374f, 8.1768f, 15.5303f, 8.4697f)
                curveTo(15.8232f, 8.7626f, 15.8232f, 9.2374f, 15.5303f, 9.5303f)
                lineTo(10.8107f, 14.25f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.25f, 14.25f, 14.5858f, 14.25f, 15.0f)
                close()
            }
        }
        .build()
        return _roundArrowLeftDown!!
    }

private var _roundArrowLeftDown: ImageVector? = null
