package com.chiksmedina.solar.outline.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.BusinessStatisticGroup

public val BusinessStatisticGroup.CourseUp: ImageVector
    get() {
        if (_courseUp != null) {
            return _courseUp!!
        }
        _courseUp = Builder(name = "CourseUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.6679f, 7.0f)
                curveTo(15.6679f, 6.5858f, 16.0037f, 6.25f, 16.4179f, 6.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 6.25f, 22.75f, 6.5858f, 22.75f, 7.0f)
                verticalLineTo(12.5458f)
                curveTo(22.75f, 12.96f, 22.4142f, 13.2958f, 22.0f, 13.2958f)
                curveTo(21.5858f, 13.2958f, 21.25f, 12.96f, 21.25f, 12.5458f)
                verticalLineTo(8.8029f)
                lineTo(15.1142f, 14.9013f)
                curveTo(14.6452f, 15.3674f, 14.241f, 15.7692f, 13.8739f, 16.0477f)
                curveTo(13.4805f, 16.3462f, 13.0432f, 16.572f, 12.505f, 16.572f)
                curveTo(11.9668f, 16.5719f, 11.5297f, 16.346f, 11.1363f, 16.0474f)
                curveTo(10.7693f, 15.7688f, 10.3652f, 15.367f, 9.8963f, 14.9007f)
                lineTo(9.6221f, 14.628f)
                curveTo(9.1079f, 14.1167f, 8.7746f, 13.7875f, 8.497f, 13.5769f)
                curveTo(8.2367f, 13.3794f, 8.1151f, 13.3573f, 8.0345f, 13.3574f)
                curveTo(7.954f, 13.3574f, 7.8323f, 13.3795f, 7.5722f, 13.5772f)
                curveTo(7.2948f, 13.7881f, 6.9617f, 14.1175f, 6.4479f, 14.6292f)
                lineTo(2.5292f, 18.5314f)
                curveTo(2.2357f, 18.8237f, 1.7609f, 18.8227f, 1.4686f, 18.5292f)
                curveTo(1.1763f, 18.2357f, 1.1773f, 17.7608f, 1.4708f, 17.4686f)
                lineTo(5.4244f, 13.5315f)
                curveTo(5.8933f, 13.0645f, 6.2975f, 12.662f, 6.6645f, 12.383f)
                curveTo(7.0581f, 12.0839f, 7.4954f, 11.8576f, 8.034f, 11.8574f)
                curveTo(8.5726f, 11.8572f, 9.0101f, 12.0832f, 9.4038f, 12.382f)
                curveTo(9.7711f, 12.6607f, 10.1755f, 13.063f, 10.6448f, 13.5296f)
                lineTo(10.9191f, 13.8024f)
                curveTo(11.4328f, 14.3132f, 11.7658f, 14.6421f, 12.0431f, 14.8526f)
                curveTo(12.3031f, 15.0499f, 12.4247f, 15.072f, 12.5052f, 15.072f)
                curveTo(12.5858f, 15.072f, 12.7073f, 15.0499f, 12.9674f, 14.8527f)
                curveTo(13.2447f, 14.6423f, 13.5778f, 14.3134f, 14.0917f, 13.8027f)
                lineTo(20.1815f, 7.75f)
                horizontalLineTo(16.4179f)
                curveTo(16.0037f, 7.75f, 15.6679f, 7.4142f, 15.6679f, 7.0f)
                close()
            }
        }
        .build()
        return _courseUp!!
    }

private var _courseUp: ImageVector? = null
