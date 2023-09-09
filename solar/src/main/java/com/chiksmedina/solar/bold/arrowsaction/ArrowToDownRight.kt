package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.ArrowToDownRight: ImageVector
    get() {
        if (_arrowToDownRight != null) {
            return _arrowToDownRight!!
        }
        _arrowToDownRight = Builder(name = "ArrowToDownRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.4697f, 13.9697f)
                curveTo(6.1768f, 14.2626f, 6.1768f, 14.7374f, 6.4697f, 15.0303f)
                lineTo(11.4697f, 20.0303f)
                curveTo(11.7626f, 20.3232f, 12.2374f, 20.3232f, 12.5303f, 20.0303f)
                lineTo(17.5303f, 15.0303f)
                curveTo(17.8232f, 14.7374f, 17.8232f, 14.2626f, 17.5303f, 13.9697f)
                curveTo(17.2374f, 13.6768f, 16.7626f, 13.6768f, 16.4697f, 13.9697f)
                lineTo(12.75f, 17.6893f)
                lineTo(12.75f, 9.5f)
                curveTo(12.75f, 8.7867f, 12.9702f, 7.7f, 13.6087f, 6.8132f)
                curveTo(14.2196f, 5.9647f, 15.2444f, 5.25f, 17.0f, 5.25f)
                curveTo(17.4142f, 5.25f, 17.75f, 4.9142f, 17.75f, 4.5f)
                curveTo(17.75f, 4.0858f, 17.4142f, 3.75f, 17.0f, 3.75f)
                curveTo(14.7556f, 3.75f, 13.2804f, 4.702f, 12.3913f, 5.9368f)
                curveTo(11.5298f, 7.1333f, 11.25f, 8.5466f, 11.25f, 9.5f)
                lineTo(11.25f, 17.6893f)
                lineTo(7.5303f, 13.9697f)
                curveTo(7.2374f, 13.6768f, 6.7626f, 13.6768f, 6.4697f, 13.9697f)
                close()
            }
        }
        .build()
        return _arrowToDownRight!!
    }

private var _arrowToDownRight: ImageVector? = null
