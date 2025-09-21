package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.RoundSortVertical: ImageVector
    get() {
        if (_roundSortVertical != null) {
            return _roundSortVertical!!
        }
        _roundSortVertical = Builder(
            name = "RoundSortVertical", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(14.5f, 7.25f)
                curveTo(14.7113f, 7.25f, 14.9128f, 7.3391f, 15.055f, 7.4955f)
                lineTo(17.555f, 10.2455f)
                curveTo(17.8336f, 10.552f, 17.811f, 11.0263f, 17.5045f, 11.305f)
                curveTo(17.198f, 11.5836f, 16.7237f, 11.561f, 16.445f, 11.2545f)
                lineTo(15.25f, 9.94f)
                lineTo(15.25f, 16.0f)
                curveTo(15.25f, 16.4142f, 14.9142f, 16.75f, 14.5f, 16.75f)
                curveTo(14.0858f, 16.75f, 13.75f, 16.4142f, 13.75f, 16.0f)
                verticalLineTo(9.94f)
                lineTo(12.555f, 11.2545f)
                curveTo(12.2763f, 11.561f, 11.802f, 11.5836f, 11.4955f, 11.305f)
                curveTo(11.189f, 11.0263f, 11.1664f, 10.552f, 11.445f, 10.2455f)
                lineTo(13.945f, 7.4955f)
                curveTo(14.0872f, 7.3391f, 14.2887f, 7.25f, 14.5f, 7.25f)
                close()
                moveTo(9.5f, 7.25f)
                curveTo(9.9142f, 7.25f, 10.25f, 7.5858f, 10.25f, 8.0f)
                verticalLineTo(14.06f)
                lineTo(11.445f, 12.7455f)
                curveTo(11.7237f, 12.439f, 12.198f, 12.4164f, 12.5045f, 12.695f)
                curveTo(12.811f, 12.9737f, 12.8336f, 13.448f, 12.555f, 13.7545f)
                lineTo(10.055f, 16.5045f)
                curveTo(9.9128f, 16.6609f, 9.7113f, 16.75f, 9.5f, 16.75f)
                curveTo(9.2887f, 16.75f, 9.0872f, 16.6609f, 8.945f, 16.5045f)
                lineTo(6.445f, 13.7545f)
                curveTo(6.1664f, 13.448f, 6.189f, 12.9737f, 6.4955f, 12.695f)
                curveTo(6.802f, 12.4164f, 7.2763f, 12.439f, 7.555f, 12.7455f)
                lineTo(8.75f, 14.06f)
                lineTo(8.75f, 8.0f)
                curveTo(8.75f, 7.5858f, 9.0858f, 7.25f, 9.5f, 7.25f)
                close()
            }
        }
            .build()
        return _roundSortVertical!!
    }

private var _roundSortVertical: ImageVector? = null
