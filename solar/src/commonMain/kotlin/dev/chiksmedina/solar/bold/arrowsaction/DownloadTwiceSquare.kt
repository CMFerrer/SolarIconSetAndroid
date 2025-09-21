package dev.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.DownloadTwiceSquare: ImageVector
    get() {
        if (_downloadTwiceSquare != null) {
            return _downloadTwiceSquare!!
        }
        _downloadTwiceSquare = Builder(
            name = "DownloadTwiceSquare", defaultWidth = 24.0.dp,
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
                moveTo(9.25f, 7.0f)
                curveTo(9.25f, 6.5858f, 8.9142f, 6.25f, 8.5f, 6.25f)
                curveTo(8.0858f, 6.25f, 7.75f, 6.5858f, 7.75f, 7.0f)
                verticalLineTo(11.9285f)
                lineTo(6.5762f, 10.5199f)
                curveTo(6.311f, 10.2017f, 5.8381f, 10.1587f, 5.5199f, 10.4238f)
                curveTo(5.2017f, 10.689f, 5.1587f, 11.1619f, 5.4238f, 11.4801f)
                lineTo(7.9238f, 14.4801f)
                curveTo(8.0663f, 14.6511f, 8.2774f, 14.75f, 8.5f, 14.75f)
                curveTo(8.7226f, 14.75f, 8.9337f, 14.6511f, 9.0762f, 14.4801f)
                lineTo(11.5762f, 11.4801f)
                curveTo(11.8413f, 11.1619f, 11.7983f, 10.689f, 11.4801f, 10.4238f)
                curveTo(11.1619f, 10.1587f, 10.689f, 10.2017f, 10.4238f, 10.5199f)
                lineTo(9.25f, 11.9285f)
                verticalLineTo(7.0f)
                close()
                moveTo(15.5f, 6.25f)
                curveTo(15.9142f, 6.25f, 16.25f, 6.5858f, 16.25f, 7.0f)
                verticalLineTo(11.9285f)
                lineTo(17.4238f, 10.5199f)
                curveTo(17.689f, 10.2017f, 18.1619f, 10.1587f, 18.4801f, 10.4238f)
                curveTo(18.7983f, 10.689f, 18.8413f, 11.1619f, 18.5762f, 11.4801f)
                lineTo(16.0762f, 14.4801f)
                curveTo(15.9337f, 14.6511f, 15.7226f, 14.75f, 15.5f, 14.75f)
                curveTo(15.2774f, 14.75f, 15.0663f, 14.6511f, 14.9238f, 14.4801f)
                lineTo(12.4238f, 11.4801f)
                curveTo(12.1587f, 11.1619f, 12.2017f, 10.689f, 12.5199f, 10.4238f)
                curveTo(12.8381f, 10.1587f, 13.311f, 10.2017f, 13.5762f, 10.5199f)
                lineTo(14.75f, 11.9285f)
                verticalLineTo(7.0f)
                curveTo(14.75f, 6.5858f, 15.0858f, 6.25f, 15.5f, 6.25f)
                close()
                moveTo(6.0f, 16.25f)
                curveTo(5.5858f, 16.25f, 5.25f, 16.5858f, 5.25f, 17.0f)
                curveTo(5.25f, 17.4142f, 5.5858f, 17.75f, 6.0f, 17.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 17.75f, 18.75f, 17.4142f, 18.75f, 17.0f)
                curveTo(18.75f, 16.5858f, 18.4142f, 16.25f, 18.0f, 16.25f)
                horizontalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _downloadTwiceSquare!!
    }

private var _downloadTwiceSquare: ImageVector? = null
