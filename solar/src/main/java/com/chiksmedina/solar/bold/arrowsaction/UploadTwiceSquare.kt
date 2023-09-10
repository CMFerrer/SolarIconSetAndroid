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

val ArrowsActionGroup.UploadTwiceSquare: ImageVector
    get() {
        if (_uploadTwiceSquare != null) {
            return _uploadTwiceSquare!!
        }
        _uploadTwiceSquare = Builder(
            name = "UploadTwiceSquare", defaultWidth = 24.0.dp,
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
                moveTo(9.25f, 17.0f)
                curveTo(9.25f, 17.4142f, 8.9142f, 17.75f, 8.5f, 17.75f)
                curveTo(8.0858f, 17.75f, 7.75f, 17.4142f, 7.75f, 17.0f)
                verticalLineTo(12.0715f)
                lineTo(6.5762f, 13.4801f)
                curveTo(6.311f, 13.7983f, 5.8381f, 13.8413f, 5.5199f, 13.5762f)
                curveTo(5.2017f, 13.311f, 5.1587f, 12.8381f, 5.4238f, 12.5199f)
                lineTo(7.9238f, 9.5199f)
                curveTo(8.0663f, 9.3489f, 8.2774f, 9.25f, 8.5f, 9.25f)
                curveTo(8.7226f, 9.25f, 8.9337f, 9.3489f, 9.0762f, 9.5199f)
                lineTo(11.5762f, 12.5199f)
                curveTo(11.8413f, 12.8381f, 11.7983f, 13.311f, 11.4801f, 13.5762f)
                curveTo(11.1619f, 13.8413f, 10.689f, 13.7983f, 10.4238f, 13.4801f)
                lineTo(9.25f, 12.0715f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.5f, 17.75f)
                curveTo(15.9142f, 17.75f, 16.25f, 17.4142f, 16.25f, 17.0f)
                verticalLineTo(12.0715f)
                lineTo(17.4238f, 13.4801f)
                curveTo(17.689f, 13.7983f, 18.1619f, 13.8413f, 18.4801f, 13.5762f)
                curveTo(18.7983f, 13.311f, 18.8413f, 12.8381f, 18.5762f, 12.5199f)
                lineTo(16.0762f, 9.5199f)
                curveTo(15.9337f, 9.3489f, 15.7226f, 9.25f, 15.5f, 9.25f)
                curveTo(15.2774f, 9.25f, 15.0663f, 9.3489f, 14.9238f, 9.5199f)
                lineTo(12.4238f, 12.5199f)
                curveTo(12.1587f, 12.8381f, 12.2017f, 13.311f, 12.5199f, 13.5762f)
                curveTo(12.8381f, 13.8413f, 13.311f, 13.7983f, 13.5762f, 13.4801f)
                lineTo(14.75f, 12.0715f)
                verticalLineTo(17.0f)
                curveTo(14.75f, 17.4142f, 15.0858f, 17.75f, 15.5f, 17.75f)
                close()
                moveTo(6.0f, 7.75f)
                curveTo(5.5858f, 7.75f, 5.25f, 7.4142f, 5.25f, 7.0f)
                curveTo(5.25f, 6.5858f, 5.5858f, 6.25f, 6.0f, 6.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 6.25f, 18.75f, 6.5858f, 18.75f, 7.0f)
                curveTo(18.75f, 7.4142f, 18.4142f, 7.75f, 18.0f, 7.75f)
                horizontalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _uploadTwiceSquare!!
    }

private var _uploadTwiceSquare: ImageVector? = null
