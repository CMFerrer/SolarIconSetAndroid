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

public val ArrowsActionGroup.UndoRightRoundSquare: ImageVector
    get() {
        if (_undoRightRoundSquare != null) {
            return _undoRightRoundSquare!!
        }
        _undoRightRoundSquare = Builder(name = "UndoRightRoundSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.7141f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(15.7587f, 6.8727f)
                curveTo(15.4543f, 6.5918f, 14.9799f, 6.6108f, 14.6989f, 6.9151f)
                curveTo(14.4179f, 7.2195f, 14.4369f, 7.694f, 14.7413f, 7.9749f)
                lineTo(15.5818f, 8.7507f)
                horizontalLineTo(9.9615f)
                curveTo(7.6356f, 8.7507f, 5.75f, 10.6363f, 5.75f, 12.9623f)
                curveTo(5.75f, 15.2883f, 7.6356f, 17.1738f, 9.9615f, 17.1738f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 17.1738f, 15.25f, 16.838f, 15.25f, 16.4238f)
                curveTo(15.25f, 16.0096f, 14.9142f, 15.6738f, 14.5f, 15.6738f)
                horizontalLineTo(9.9615f)
                curveTo(8.464f, 15.6738f, 7.25f, 14.4598f, 7.25f, 12.9623f)
                curveTo(7.25f, 11.4647f, 8.464f, 10.2508f, 9.9615f, 10.2508f)
                horizontalLineTo(15.5818f)
                lineTo(14.7413f, 11.0266f)
                curveTo(14.4369f, 11.3075f, 14.4179f, 11.782f, 14.6989f, 12.0864f)
                curveTo(14.9799f, 12.3908f, 15.4543f, 12.4097f, 15.7587f, 12.1288f)
                lineTo(18.0087f, 10.0519f)
                curveTo(18.1625f, 9.9099f, 18.25f, 9.7101f, 18.25f, 9.5007f)
                curveTo(18.25f, 9.2914f, 18.1625f, 9.0916f, 18.0087f, 8.9496f)
                lineTo(15.7587f, 6.8727f)
                close()
            }
        }
        .build()
        return _undoRightRoundSquare!!
    }

private var _undoRightRoundSquare: ImageVector? = null
