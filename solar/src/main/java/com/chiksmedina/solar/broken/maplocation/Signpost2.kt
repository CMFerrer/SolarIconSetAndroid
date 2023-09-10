package com.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MapLocationGroup

val MapLocationGroup.Signpost2: ImageVector
    get() {
        if (_signpost2 != null) {
            return _signpost2!!
        }
        _signpost2 = Builder(
            name = "Signpost2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(11.25f, 2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 11.0f)
                curveTo(12.75f, 10.5858f, 12.4142f, 10.25f, 12.0f, 10.25f)
                curveTo(11.5858f, 10.25f, 11.25f, 10.5858f, 11.25f, 11.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(11.25f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 20.0f)
                curveTo(12.75f, 19.5858f, 12.4142f, 19.25f, 12.0f, 19.25f)
                curveTo(11.5858f, 19.25f, 11.25f, 19.5858f, 11.25f, 20.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(11.25f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.3371f, 18.6111f)
                curveTo(3.483f, 18.8295f, 3.6705f, 19.017f, 3.8889f, 19.1629f)
                curveTo(4.3934f, 19.5f, 5.0956f, 19.5f, 6.5001f, 19.5f)
                horizontalLineTo(17.2961f)
                curveTo(17.9536f, 19.5f, 18.2824f, 19.5f, 18.5841f, 19.4018f)
                curveTo(18.7172f, 19.3585f, 18.8454f, 19.3013f, 18.9666f, 19.2312f)
                curveTo(19.2412f, 19.0723f, 19.4609f, 18.8277f, 19.9002f, 18.3384f)
                curveTo(20.7509f, 17.3911f, 21.1763f, 16.9174f, 21.2787f, 16.3638f)
                curveTo(21.3232f, 16.1233f, 21.3232f, 15.8767f, 21.2787f, 15.6362f)
                curveTo(21.1763f, 15.0826f, 20.7509f, 14.6089f, 19.9002f, 13.6616f)
                curveTo(19.4609f, 13.1723f, 19.2412f, 12.9277f, 18.9666f, 12.7688f)
                curveTo(18.8454f, 12.6987f, 18.7172f, 12.6415f, 18.5841f, 12.5982f)
                curveTo(18.2824f, 12.5f, 17.9536f, 12.5f, 17.2961f, 12.5f)
                horizontalLineTo(6.5001f)
                curveTo(5.0956f, 12.5f, 4.3934f, 12.5f, 3.8889f, 12.8371f)
                curveTo(3.6705f, 12.983f, 3.483f, 13.1705f, 3.3371f, 13.3889f)
                curveTo(3.0917f, 13.7561f, 3.025f, 14.2283f, 3.0068f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.6648f, 9.6111f)
                curveTo(20.5189f, 9.8295f, 20.3314f, 10.017f, 20.113f, 10.1629f)
                curveTo(19.6086f, 10.5f, 18.9064f, 10.5f, 17.5019f, 10.5f)
                horizontalLineTo(6.7059f)
                curveTo(6.0483f, 10.5f, 5.7195f, 10.5f, 5.4178f, 10.4018f)
                curveTo(5.2847f, 10.3585f, 5.1565f, 10.3013f, 5.0354f, 10.2312f)
                curveTo(4.7607f, 10.0723f, 4.541f, 9.8277f, 4.1017f, 9.3384f)
                curveTo(3.251f, 8.3911f, 2.8257f, 7.9174f, 2.7233f, 7.3638f)
                curveTo(2.6788f, 7.1233f, 2.6788f, 6.8767f, 2.7233f, 6.6362f)
                curveTo(2.8257f, 6.0826f, 3.251f, 5.6089f, 4.1017f, 4.6616f)
                curveTo(4.541f, 4.1723f, 4.7607f, 3.9277f, 5.0354f, 3.7688f)
                curveTo(5.1565f, 3.6987f, 5.2847f, 3.6415f, 5.4178f, 3.5982f)
                curveTo(5.7195f, 3.5f, 6.0483f, 3.5f, 6.7059f, 3.5f)
                horizontalLineTo(17.5019f)
                curveTo(18.9064f, 3.5f, 19.6086f, 3.5f, 20.113f, 3.8371f)
                curveTo(20.3314f, 3.983f, 20.5189f, 4.1705f, 20.6648f, 4.3889f)
                curveTo(20.9102f, 4.7561f, 20.977f, 5.2283f, 20.9951f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 7.0f)
                horizontalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 16.0f)
                lineTo(15.0f, 16.0f)
            }
        }
            .build()
        return _signpost2!!
    }

private var _signpost2: ImageVector? = null
