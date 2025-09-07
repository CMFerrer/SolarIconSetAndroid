package com.chiksmedina.solar.lineduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MapLocationGroup

val MapLocationGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(
            name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.704f, 3.5f)
                horizontalLineTo(17.5f)
                curveTo(18.9045f, 3.5f, 19.6067f, 3.5f, 20.1111f, 3.8371f)
                curveTo(20.3295f, 3.983f, 20.517f, 4.1705f, 20.6629f, 4.3889f)
                curveTo(21.0f, 4.8933f, 21.0f, 5.5955f, 21.0f, 7.0f)
                curveTo(21.0f, 8.4045f, 21.0f, 9.1067f, 20.6629f, 9.6111f)
                curveTo(20.517f, 9.8295f, 20.3295f, 10.017f, 20.1111f, 10.1629f)
                curveTo(19.6067f, 10.5f, 18.9045f, 10.5f, 17.5f, 10.5f)
                horizontalLineTo(6.704f)
                curveTo(6.0464f, 10.5f, 5.7176f, 10.5f, 5.4159f, 10.4018f)
                curveTo(5.2828f, 10.3585f, 5.1546f, 10.3013f, 5.0335f, 10.2312f)
                curveTo(4.7588f, 10.0723f, 4.5392f, 9.8277f, 4.0998f, 9.3384f)
                curveTo(3.2491f, 8.3911f, 2.8238f, 7.9174f, 2.7214f, 7.3638f)
                curveTo(2.6769f, 7.1233f, 2.6769f, 6.8767f, 2.7214f, 6.6362f)
                curveTo(2.8238f, 6.0826f, 3.2491f, 5.6089f, 4.0998f, 4.6616f)
                curveTo(4.5392f, 4.1723f, 4.7588f, 3.9277f, 5.0335f, 3.7688f)
                curveTo(5.1546f, 3.6987f, 5.2828f, 3.6415f, 5.4159f, 3.5982f)
                curveTo(5.7176f, 3.5f, 6.0464f, 3.5f, 6.704f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.296f, 12.5f)
                horizontalLineTo(6.5f)
                curveTo(5.0955f, 12.5f, 4.3933f, 12.5f, 3.8889f, 12.8371f)
                curveTo(3.6705f, 12.983f, 3.483f, 13.1705f, 3.3371f, 13.3889f)
                curveTo(3.0f, 13.8933f, 3.0f, 14.5955f, 3.0f, 16.0f)
                curveTo(3.0f, 17.4045f, 3.0f, 18.1067f, 3.3371f, 18.6111f)
                curveTo(3.483f, 18.8295f, 3.6705f, 19.017f, 3.8889f, 19.1629f)
                curveTo(4.3933f, 19.5f, 5.0955f, 19.5f, 6.5f, 19.5f)
                horizontalLineTo(17.296f)
                curveTo(17.9536f, 19.5f, 18.2824f, 19.5f, 18.5841f, 19.4018f)
                curveTo(18.7172f, 19.3585f, 18.8454f, 19.3013f, 18.9665f, 19.2312f)
                curveTo(19.2412f, 19.0723f, 19.4608f, 18.8277f, 19.9002f, 18.3384f)
                curveTo(20.7509f, 17.3911f, 21.1762f, 16.9174f, 21.2786f, 16.3638f)
                curveTo(21.3231f, 16.1233f, 21.3231f, 15.8767f, 21.2786f, 15.6362f)
                curveTo(21.1762f, 15.0826f, 20.7509f, 14.6089f, 19.9002f, 13.6616f)
                curveTo(19.4608f, 13.1723f, 19.2412f, 12.9277f, 18.9665f, 12.7688f)
                curveTo(18.8454f, 12.6987f, 18.7172f, 12.6415f, 18.5841f, 12.5982f)
                curveTo(18.2824f, 12.5f, 17.9536f, 12.5f, 17.296f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 11.0f)
                curveTo(12.75f, 10.5858f, 12.4142f, 10.25f, 12.0f, 10.25f)
                curveTo(11.5858f, 10.25f, 11.25f, 10.5858f, 11.25f, 11.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 20.0f)
                curveTo(12.75f, 19.5858f, 12.4142f, 19.25f, 12.0f, 19.25f)
                curveTo(11.5858f, 19.25f, 11.25f, 19.5858f, 11.25f, 20.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(14.0f, 22.75f)
                curveTo(14.4142f, 22.75f, 14.75f, 22.4142f, 14.75f, 22.0f)
                curveTo(14.75f, 21.5858f, 14.4142f, 21.25f, 14.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(10.0f, 21.25f)
                curveTo(9.5858f, 21.25f, 9.25f, 21.5858f, 9.25f, 22.0f)
                curveTo(9.25f, 22.4142f, 9.5858f, 22.75f, 10.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(11.25f, 2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(14.0f, 21.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.25f)
                close()
            }
        }
            .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
