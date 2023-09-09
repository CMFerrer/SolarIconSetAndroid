package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Plate: ImageVector
    get() {
        if (_plate != null) {
            return _plate!!
        }
        _plate = Builder(name = "Plate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 3.0f)
                curveTo(12.75f, 2.5858f, 12.4142f, 2.25f, 12.0f, 2.25f)
                curveTo(11.5858f, 2.25f, 11.25f, 2.5858f, 11.25f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 5.4142f, 11.5858f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.75f, 12.0565f)
                curveTo(22.75f, 13.8943f, 22.75f, 15.3499f, 22.5969f, 16.4891f)
                curveTo(22.4392f, 17.6615f, 22.1071f, 18.6105f, 21.3588f, 19.3588f)
                curveTo(20.6104f, 20.1072f, 19.6614f, 20.4393f, 18.489f, 20.597f)
                curveTo(17.3498f, 20.7501f, 15.8942f, 20.7501f, 14.0565f, 20.7501f)
                horizontalLineTo(9.9435f)
                curveTo(8.1058f, 20.7501f, 6.6502f, 20.7501f, 5.511f, 20.597f)
                curveTo(4.3386f, 20.4393f, 3.3896f, 20.1072f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6105f, 1.5608f, 17.6615f, 1.4031f, 16.4891f)
                curveTo(1.25f, 15.3499f, 1.25f, 13.8943f, 1.25f, 12.0565f)
                lineTo(1.25f, 11.7725f)
                curveTo(1.25f, 11.5529f, 1.2501f, 11.3388f, 1.2505f, 11.1303f)
                curveTo(1.2513f, 10.7466f, 1.2533f, 10.3814f, 1.2581f, 10.034f)
                curveTo(1.2715f, 9.0587f, 1.3074f, 8.2232f, 1.4031f, 7.5112f)
                curveTo(1.5608f, 6.3387f, 1.8929f, 5.3898f, 2.6412f, 4.6414f)
                curveTo(3.3896f, 3.8931f, 4.3386f, 3.5609f, 5.511f, 3.4033f)
                curveTo(6.2274f, 3.307f, 7.069f, 3.2713f, 8.0521f, 3.258f)
                curveTo(8.2173f, 3.2558f, 8.4747f, 3.2541f, 8.7486f, 3.2529f)
                curveTo(9.3014f, 3.2505f, 9.75f, 3.6987f, 9.75f, 4.2516f)
                verticalLineTo(5.0001f)
                curveTo(9.75f, 6.2427f, 10.7574f, 7.2501f, 12.0f, 7.2501f)
                curveTo(13.2426f, 7.2501f, 14.25f, 6.2427f, 14.25f, 5.0001f)
                verticalLineTo(4.2503f)
                curveTo(14.25f, 3.698f, 14.698f, 3.2494f, 15.2503f, 3.252f)
                curveTo(16.5391f, 3.2581f, 17.6086f, 3.2849f, 18.489f, 3.4033f)
                curveTo(19.6614f, 3.5609f, 20.6104f, 3.8931f, 21.3588f, 4.6414f)
                curveTo(22.1071f, 5.3898f, 22.4392f, 6.3387f, 22.5969f, 7.5112f)
                curveTo(22.75f, 8.6504f, 22.75f, 10.1059f, 22.75f, 11.9437f)
                verticalLineTo(12.0565f)
                close()
                moveTo(8.0f, 9.7501f)
                curveTo(7.5858f, 9.7501f, 7.25f, 10.0859f, 7.25f, 10.5001f)
                curveTo(7.25f, 10.9143f, 7.5858f, 11.2501f, 8.0f, 11.2501f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 11.2501f, 16.75f, 10.9143f, 16.75f, 10.5001f)
                curveTo(16.75f, 10.0859f, 16.4142f, 9.7501f, 16.0f, 9.7501f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 13.2501f)
                curveTo(7.5858f, 13.2501f, 7.25f, 13.5859f, 7.25f, 14.0001f)
                curveTo(7.25f, 14.4143f, 7.5858f, 14.7501f, 8.0f, 14.7501f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.7501f, 14.25f, 14.4143f, 14.25f, 14.0001f)
                curveTo(14.25f, 13.5859f, 13.9142f, 13.2501f, 13.5f, 13.2501f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _plate!!
    }

private var _plate: ImageVector? = null
