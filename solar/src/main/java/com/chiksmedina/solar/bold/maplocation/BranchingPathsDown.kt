package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.BranchingPathsDown: ImageVector
    get() {
        if (_branchingPathsDown != null) {
            return _branchingPathsDown!!
        }
        _branchingPathsDown = Builder(
            name = "BranchingPathsDown", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 6.0858f, 12.75f, 6.5f)
                verticalLineTo(12.5f)
                curveTo(12.75f, 14.2949f, 14.2051f, 15.75f, 16.0f, 15.75f)
                horizontalLineTo(16.1893f)
                lineTo(15.9697f, 15.5303f)
                curveTo(15.6768f, 15.2374f, 15.6768f, 14.7626f, 15.9697f, 14.4697f)
                curveTo(16.2626f, 14.1768f, 16.7374f, 14.1768f, 17.0303f, 14.4697f)
                lineTo(18.5303f, 15.9697f)
                curveTo(18.8232f, 16.2626f, 18.8232f, 16.7374f, 18.5303f, 17.0303f)
                lineTo(17.0303f, 18.5303f)
                curveTo(16.7374f, 18.8232f, 16.2626f, 18.8232f, 15.9697f, 18.5303f)
                curveTo(15.6768f, 18.2374f, 15.6768f, 17.7626f, 15.9697f, 17.4697f)
                lineTo(16.1893f, 17.25f)
                horizontalLineTo(16.0f)
                curveTo(14.3205f, 17.25f, 12.8446f, 16.3784f, 12.0f, 15.0628f)
                curveTo(11.1554f, 16.3784f, 9.6795f, 17.25f, 8.0f, 17.25f)
                horizontalLineTo(7.8107f)
                lineTo(8.0303f, 17.4697f)
                curveTo(8.3232f, 17.7626f, 8.3232f, 18.2374f, 8.0303f, 18.5303f)
                curveTo(7.7374f, 18.8232f, 7.2626f, 18.8232f, 6.9697f, 18.5303f)
                lineTo(5.4697f, 17.0303f)
                curveTo(5.1768f, 16.7374f, 5.1768f, 16.2626f, 5.4697f, 15.9697f)
                lineTo(6.9697f, 14.4697f)
                curveTo(7.2626f, 14.1768f, 7.7374f, 14.1768f, 8.0303f, 14.4697f)
                curveTo(8.3232f, 14.7626f, 8.3232f, 15.2374f, 8.0303f, 15.5303f)
                lineTo(7.8107f, 15.75f)
                horizontalLineTo(8.0f)
                curveTo(9.7949f, 15.75f, 11.25f, 14.2949f, 11.25f, 12.5f)
                verticalLineTo(6.5f)
                curveTo(11.25f, 6.0858f, 11.5858f, 5.75f, 12.0f, 5.75f)
                close()
            }
        }
            .build()
        return _branchingPathsDown!!
    }

private var _branchingPathsDown: ImageVector? = null
