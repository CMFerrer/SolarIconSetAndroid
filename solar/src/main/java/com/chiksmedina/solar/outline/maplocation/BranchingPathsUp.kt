package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.BranchingPathsUp: ImageVector
    get() {
        if (_branchingPathsUp != null) {
            return _branchingPathsUp!!
        }
        _branchingPathsUp = Builder(
            name = "BranchingPathsUp", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0303f, 5.9697f)
                curveTo(8.3232f, 6.2626f, 8.3232f, 6.7374f, 8.0303f, 7.0303f)
                lineTo(7.8107f, 7.25f)
                horizontalLineTo(8.0f)
                curveTo(9.6795f, 7.25f, 11.1554f, 8.1216f, 12.0f, 9.4372f)
                curveTo(12.8446f, 8.1216f, 14.3205f, 7.25f, 16.0f, 7.25f)
                horizontalLineTo(16.1893f)
                lineTo(15.9697f, 7.0303f)
                curveTo(15.6768f, 6.7374f, 15.6768f, 6.2626f, 15.9697f, 5.9697f)
                curveTo(16.2626f, 5.6768f, 16.7374f, 5.6768f, 17.0303f, 5.9697f)
                lineTo(18.5303f, 7.4697f)
                curveTo(18.8232f, 7.7626f, 18.8232f, 8.2374f, 18.5303f, 8.5303f)
                lineTo(17.0303f, 10.0303f)
                curveTo(16.7374f, 10.3232f, 16.2626f, 10.3232f, 15.9697f, 10.0303f)
                curveTo(15.6768f, 9.7374f, 15.6768f, 9.2626f, 15.9697f, 8.9697f)
                lineTo(16.1893f, 8.75f)
                horizontalLineTo(16.0f)
                curveTo(14.2051f, 8.75f, 12.75f, 10.2051f, 12.75f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 10.2051f, 9.7949f, 8.75f, 8.0f, 8.75f)
                horizontalLineTo(7.8107f)
                lineTo(8.0303f, 8.9697f)
                curveTo(8.3232f, 9.2626f, 8.3232f, 9.7374f, 8.0303f, 10.0303f)
                curveTo(7.7374f, 10.3232f, 7.2626f, 10.3232f, 6.9697f, 10.0303f)
                lineTo(5.4697f, 8.5303f)
                curveTo(5.1768f, 8.2374f, 5.1768f, 7.7626f, 5.4697f, 7.4697f)
                lineTo(6.9697f, 5.9697f)
                curveTo(7.2626f, 5.6768f, 7.7374f, 5.6768f, 8.0303f, 5.9697f)
                close()
            }
        }
            .build()
        return _branchingPathsUp!!
    }

private var _branchingPathsUp: ImageVector? = null
