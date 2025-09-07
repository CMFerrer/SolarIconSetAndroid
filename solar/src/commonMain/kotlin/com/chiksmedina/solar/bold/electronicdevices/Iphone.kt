package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Iphone: ImageVector
    get() {
        if (_iphone != null) {
            return _iphone!!
        }
        _iphone = Builder(
            name = "Iphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.0f, 9.8014f)
                verticalLineTo(13.8676f)
                curveTo(20.0f, 17.7013f, 20.0f, 19.6181f, 18.8284f, 20.809f)
                curveTo(17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f, 22.0f)
                curveTo(8.2288f, 22.0f, 6.3432f, 22.0f, 5.1716f, 20.809f)
                curveTo(4.0f, 19.6181f, 4.0f, 17.7013f, 4.0f, 13.8676f)
                verticalLineTo(9.8014f)
                curveTo(4.0f, 5.9678f, 4.0f, 4.051f, 5.1716f, 2.86f)
                curveTo(5.5474f, 2.478f, 5.9967f, 2.2185f, 6.5581f, 2.0423f)
                curveTo(6.9114f, 1.9314f, 7.2856f, 2.0893f, 7.5f, 2.3926f)
                curveTo(7.5539f, 2.4748f, 7.6051f, 2.553f, 7.6538f, 2.6275f)
                curveTo(8.2883f, 3.5975f, 8.5094f, 3.9354f, 9.0222f, 4.2594f)
                curveTo(9.132f, 4.3287f, 9.246f, 4.3908f, 9.3637f, 4.4452f)
                curveTo(9.9555f, 4.7187f, 10.637f, 4.7187f, 12.0f, 4.7187f)
                curveTo(13.363f, 4.7187f, 14.0445f, 4.7187f, 14.6363f, 4.4452f)
                curveTo(14.754f, 4.3908f, 14.8681f, 4.3287f, 14.9778f, 4.2594f)
                curveTo(15.4906f, 3.9354f, 15.7117f, 3.5975f, 16.3462f, 2.6275f)
                curveTo(16.3949f, 2.5531f, 16.4461f, 2.4748f, 16.5f, 2.3926f)
                curveTo(16.6992f, 2.0884f, 17.0639f, 1.9264f, 17.4105f, 2.0326f)
                curveTo(17.9866f, 2.209f, 18.4456f, 2.4709f, 18.8284f, 2.86f)
                curveTo(20.0f, 4.051f, 20.0f, 5.9678f, 20.0f, 9.8014f)
                close()
                moveTo(9.0f, 18.2294f)
                curveTo(8.5858f, 18.2294f, 8.25f, 18.567f, 8.25f, 18.9835f)
                curveTo(8.25f, 19.4f, 8.5858f, 19.7376f, 9.0f, 19.7376f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 19.7376f, 15.75f, 19.4f, 15.75f, 18.9835f)
                curveTo(15.75f, 18.567f, 15.4142f, 18.2294f, 15.0f, 18.2294f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _iphone!!
    }

private var _iphone: ImageVector? = null
