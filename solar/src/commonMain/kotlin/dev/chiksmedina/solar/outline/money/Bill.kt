package dev.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(
            name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.1267f, 3.5605f)
                curveTo(7.7693f, 3.2428f, 7.2307f, 3.2428f, 6.8733f, 3.5605f)
                curveTo(5.9878f, 4.3477f, 4.6728f, 4.3819f, 3.75f, 3.6632f)
                verticalLineTo(20.337f)
                curveTo(4.6728f, 19.6183f, 5.9878f, 19.6525f, 6.8733f, 20.4396f)
                curveTo(7.2307f, 20.7573f, 7.7693f, 20.7573f, 8.1267f, 20.4396f)
                curveTo(9.0525f, 19.6167f, 10.4475f, 19.6167f, 11.3733f, 20.4396f)
                curveTo(11.7307f, 20.7573f, 12.2693f, 20.7573f, 12.6267f, 20.4396f)
                curveTo(13.5525f, 19.6167f, 14.9475f, 19.6167f, 15.8733f, 20.4396f)
                curveTo(16.2307f, 20.7573f, 16.7693f, 20.7573f, 17.1267f, 20.4396f)
                curveTo(18.0122f, 19.6525f, 19.3272f, 19.6183f, 20.25f, 20.337f)
                verticalLineTo(3.6632f)
                curveTo(19.3272f, 4.3819f, 18.0122f, 4.3477f, 17.1267f, 3.5605f)
                curveTo(16.7693f, 3.2428f, 16.2307f, 3.2428f, 15.8733f, 3.5605f)
                curveTo(14.9475f, 4.3834f, 13.5525f, 4.3834f, 12.6267f, 3.5605f)
                curveTo(12.2693f, 3.2428f, 11.7307f, 3.2428f, 11.3733f, 3.5605f)
                curveTo(10.4475f, 4.3834f, 9.0525f, 4.3834f, 8.1267f, 3.5605f)
                close()
                moveTo(5.8767f, 2.4394f)
                curveTo(6.8025f, 1.6165f, 8.1975f, 1.6165f, 9.1233f, 2.4394f)
                curveTo(9.4807f, 2.7571f, 10.0193f, 2.7571f, 10.3767f, 2.4394f)
                curveTo(11.3025f, 1.6165f, 12.6975f, 1.6165f, 13.6233f, 2.4394f)
                curveTo(13.9807f, 2.7571f, 14.5193f, 2.7571f, 14.8767f, 2.4394f)
                curveTo(15.8025f, 1.6165f, 17.1975f, 1.6165f, 18.1233f, 2.4394f)
                curveTo(18.4807f, 2.7571f, 19.0193f, 2.7571f, 19.3767f, 2.4394f)
                curveTo(20.2963f, 1.622f, 21.75f, 2.2748f, 21.75f, 3.5052f)
                verticalLineTo(20.495f)
                curveTo(21.75f, 21.7253f, 20.2963f, 22.3781f, 19.3767f, 21.5607f)
                curveTo(19.0193f, 21.243f, 18.4807f, 21.243f, 18.1233f, 21.5607f)
                curveTo(17.1975f, 22.3836f, 15.8025f, 22.3836f, 14.8767f, 21.5607f)
                curveTo(14.5193f, 21.243f, 13.9807f, 21.243f, 13.6233f, 21.5607f)
                curveTo(12.6975f, 22.3836f, 11.3025f, 22.3836f, 10.3767f, 21.5607f)
                curveTo(10.0193f, 21.243f, 9.4807f, 21.243f, 9.1233f, 21.5607f)
                curveTo(8.1975f, 22.3836f, 6.8025f, 22.3836f, 5.8767f, 21.5607f)
                curveTo(5.5193f, 21.243f, 4.9807f, 21.243f, 4.6233f, 21.5607f)
                curveTo(3.7037f, 22.3781f, 2.25f, 21.7253f, 2.25f, 20.495f)
                verticalLineTo(3.5052f)
                curveTo(2.25f, 2.2748f, 3.7037f, 1.622f, 4.6233f, 2.4394f)
                curveTo(4.9807f, 2.7571f, 5.5193f, 2.7571f, 5.8767f, 2.4394f)
                close()
                moveTo(6.75f, 8.5002f)
                curveTo(6.75f, 8.0859f, 7.0858f, 7.7502f, 7.5f, 7.7502f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 7.7502f, 17.25f, 8.0859f, 17.25f, 8.5002f)
                curveTo(17.25f, 8.9144f, 16.9142f, 9.2502f, 16.5f, 9.2502f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 9.2502f, 6.75f, 8.9144f, 6.75f, 8.5002f)
                close()
                moveTo(6.75f, 12.0002f)
                curveTo(6.75f, 11.586f, 7.0858f, 11.2502f, 7.5f, 11.2502f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 11.2502f, 17.25f, 11.586f, 17.25f, 12.0002f)
                curveTo(17.25f, 12.4144f, 16.9142f, 12.7502f, 16.5f, 12.7502f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 12.7502f, 6.75f, 12.4144f, 6.75f, 12.0002f)
                close()
                moveTo(6.75f, 15.5002f)
                curveTo(6.75f, 15.086f, 7.0858f, 14.7502f, 7.5f, 14.7502f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 14.7502f, 17.25f, 15.086f, 17.25f, 15.5002f)
                curveTo(17.25f, 15.9144f, 16.9142f, 16.2502f, 16.5f, 16.2502f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 16.2502f, 6.75f, 15.9144f, 6.75f, 15.5002f)
                close()
            }
        }
            .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
