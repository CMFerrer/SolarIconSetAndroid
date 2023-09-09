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

public val ArrowsGroup.SquareTransferHorizontal: ImageVector
    get() {
        if (_squareTransferHorizontal != null) {
            return _squareTransferHorizontal!!
        }
        _squareTransferHorizontal = Builder(name = "SquareTransferHorizontal", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(17.0f, 13.25f)
                curveTo(17.3126f, 13.25f, 17.5925f, 13.4439f, 17.7022f, 13.7367f)
                curveTo(17.812f, 14.0294f, 17.7287f, 14.3595f, 17.4932f, 14.5651f)
                lineTo(14.0557f, 17.5651f)
                curveTo(13.7436f, 17.8374f, 13.2698f, 17.8052f, 12.9974f, 17.4931f)
                curveTo(12.7251f, 17.1811f, 12.7573f, 16.7073f, 13.0694f, 16.4349f)
                lineTo(15.0f, 14.75f)
                lineTo(7.0f, 14.75f)
                curveTo(6.5858f, 14.75f, 6.25f, 14.4142f, 6.25f, 14.0f)
                curveTo(6.25f, 13.5858f, 6.5858f, 13.25f, 7.0f, 13.25f)
                lineTo(17.0f, 13.25f)
                close()
                moveTo(11.0026f, 6.5068f)
                curveTo(11.2749f, 6.8189f, 11.2427f, 7.2927f, 10.9307f, 7.5651f)
                lineTo(9.0f, 9.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 9.25f, 17.75f, 9.5858f, 17.75f, 10.0f)
                curveTo(17.75f, 10.4142f, 17.4142f, 10.75f, 17.0f, 10.75f)
                horizontalLineTo(7.0f)
                curveTo(6.6874f, 10.75f, 6.4075f, 10.5561f, 6.2977f, 10.2633f)
                curveTo(6.188f, 9.9706f, 6.2713f, 9.6405f, 6.5068f, 9.4349f)
                lineTo(9.9444f, 6.4349f)
                curveTo(10.2564f, 6.1626f, 10.7302f, 6.1948f, 11.0026f, 6.5068f)
                close()
            }
        }
        .build()
        return _squareTransferHorizontal!!
    }

private var _squareTransferHorizontal: ImageVector? = null
