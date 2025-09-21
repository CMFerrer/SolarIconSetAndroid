package dev.chiksmedina.solar.outline.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.BusinessStatisticGroup

val BusinessStatisticGroup.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = Builder(
            name = "Chart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0494f, 1.25f)
                horizontalLineTo(11.9506f)
                curveTo(11.2858f, 1.25f, 10.7129f, 1.2499f, 10.2542f, 1.3116f)
                curveTo(9.7625f, 1.3777f, 9.2913f, 1.5268f, 8.909f, 1.909f)
                curveTo(8.5268f, 2.2913f, 8.3777f, 2.7625f, 8.3116f, 3.2542f)
                curveTo(8.2499f, 3.7129f, 8.25f, 4.2858f, 8.25f, 4.9506f)
                lineTo(8.25f, 7.378f)
                curveTo(8.0154f, 7.2951f, 7.763f, 7.25f, 7.5f, 7.25f)
                horizontalLineTo(4.5f)
                curveTo(3.2574f, 7.25f, 2.25f, 8.2574f, 2.25f, 9.5f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(21.75f)
                verticalLineTo(14.5f)
                curveTo(21.75f, 13.2574f, 20.7426f, 12.25f, 19.5f, 12.25f)
                horizontalLineTo(16.5f)
                curveTo(16.237f, 12.25f, 15.9846f, 12.2951f, 15.75f, 12.378f)
                lineTo(15.75f, 4.9506f)
                curveTo(15.75f, 4.2858f, 15.7501f, 3.7129f, 15.6884f, 3.2542f)
                curveTo(15.6223f, 2.7625f, 15.4732f, 2.2913f, 15.091f, 1.909f)
                curveTo(14.7087f, 1.5268f, 14.2375f, 1.3777f, 13.7458f, 1.3116f)
                curveTo(13.2871f, 1.2499f, 12.7142f, 1.25f, 12.0494f, 1.25f)
                close()
                moveTo(20.25f, 21.25f)
                verticalLineTo(14.5f)
                curveTo(20.25f, 14.0858f, 19.9142f, 13.75f, 19.5f, 13.75f)
                horizontalLineTo(16.5f)
                curveTo(16.0858f, 13.75f, 15.75f, 14.0858f, 15.75f, 14.5f)
                verticalLineTo(21.25f)
                horizontalLineTo(20.25f)
                close()
                moveTo(14.25f, 21.25f)
                verticalLineTo(5.0f)
                curveTo(14.25f, 4.2717f, 14.2484f, 3.8009f, 14.2018f, 3.454f)
                curveTo(14.158f, 3.1287f, 14.0874f, 3.0268f, 14.0303f, 2.9697f)
                curveTo(13.9732f, 2.9126f, 13.8713f, 2.842f, 13.546f, 2.7982f)
                curveTo(13.1991f, 2.7516f, 12.7283f, 2.75f, 12.0f, 2.75f)
                curveTo(11.2717f, 2.75f, 10.8009f, 2.7516f, 10.454f, 2.7982f)
                curveTo(10.1287f, 2.842f, 10.0268f, 2.9126f, 9.9697f, 2.9697f)
                curveTo(9.9126f, 3.0268f, 9.842f, 3.1287f, 9.7982f, 3.454f)
                curveTo(9.7516f, 3.8009f, 9.75f, 4.2717f, 9.75f, 5.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(14.25f)
                close()
                moveTo(8.25f, 21.25f)
                verticalLineTo(9.5f)
                curveTo(8.25f, 9.0858f, 7.9142f, 8.75f, 7.5f, 8.75f)
                horizontalLineTo(4.5f)
                curveTo(4.0858f, 8.75f, 3.75f, 9.0858f, 3.75f, 9.5f)
                verticalLineTo(21.25f)
                horizontalLineTo(8.25f)
                close()
            }
        }
            .build()
        return _chart!!
    }

private var _chart: ImageVector? = null
