package com.chiksmedina.solar.lineduotone.security

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
import com.chiksmedina.solar.lineduotone.SecurityGroup

val SecurityGroup.CodeScan: ImageVector
    get() {
        if (_codeScan != null) {
            return _codeScan!!
        }
        _codeScan = Builder(
            name = "CodeScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 15.5f)
                curveTo(5.5f, 14.5572f, 5.5f, 14.0858f, 5.7929f, 13.7929f)
                curveTo(6.0858f, 13.5f, 6.5572f, 13.5f, 7.5f, 13.5f)
                horizontalLineTo(8.5f)
                curveTo(9.4428f, 13.5f, 9.9142f, 13.5f, 10.2071f, 13.7929f)
                curveTo(10.5f, 14.0858f, 10.5f, 14.5572f, 10.5f, 15.5f)
                verticalLineTo(16.5f)
                curveTo(10.5f, 17.4428f, 10.5f, 17.9142f, 10.2071f, 18.2071f)
                curveTo(9.9142f, 18.5f, 9.4428f, 18.5f, 8.5f, 18.5f)
                curveTo(7.0858f, 18.5f, 6.3787f, 18.5f, 5.9393f, 18.0607f)
                curveTo(5.5f, 17.6213f, 5.5f, 16.9142f, 5.5f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 8.5f)
                curveTo(5.5f, 7.0858f, 5.5f, 6.3787f, 5.9393f, 5.9393f)
                curveTo(6.3787f, 5.5f, 7.0858f, 5.5f, 8.5f, 5.5f)
                curveTo(9.4428f, 5.5f, 9.9142f, 5.5f, 10.2071f, 5.7929f)
                curveTo(10.5f, 6.0858f, 10.5f, 6.5572f, 10.5f, 7.5f)
                verticalLineTo(8.5f)
                curveTo(10.5f, 9.4428f, 10.5f, 9.9142f, 10.2071f, 10.2071f)
                curveTo(9.9142f, 10.5f, 9.4428f, 10.5f, 8.5f, 10.5f)
                horizontalLineTo(7.5f)
                curveTo(6.5572f, 10.5f, 6.0858f, 10.5f, 5.7929f, 10.2071f)
                curveTo(5.5f, 9.9142f, 5.5f, 9.4428f, 5.5f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 15.5f)
                curveTo(13.5f, 14.5572f, 13.5f, 14.0858f, 13.7929f, 13.7929f)
                curveTo(14.0858f, 13.5f, 14.5572f, 13.5f, 15.5f, 13.5f)
                horizontalLineTo(16.5f)
                curveTo(17.4428f, 13.5f, 17.9142f, 13.5f, 18.2071f, 13.7929f)
                curveTo(18.5f, 14.0858f, 18.5f, 14.5572f, 18.5f, 15.5f)
                curveTo(18.5f, 16.9142f, 18.5f, 17.6213f, 18.0607f, 18.0607f)
                curveTo(17.6213f, 18.5f, 16.9142f, 18.5f, 15.5f, 18.5f)
                curveTo(14.5572f, 18.5f, 14.0858f, 18.5f, 13.7929f, 18.2071f)
                curveTo(13.5f, 17.9142f, 13.5f, 17.4428f, 13.5f, 16.5f)
                verticalLineTo(15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 7.5f)
                curveTo(13.5f, 6.5572f, 13.5f, 6.0858f, 13.7929f, 5.7929f)
                curveTo(14.0858f, 5.5f, 14.5572f, 5.5f, 15.5f, 5.5f)
                curveTo(16.9142f, 5.5f, 17.6213f, 5.5f, 18.0607f, 5.9393f)
                curveTo(18.5f, 6.3787f, 18.5f, 7.0858f, 18.5f, 8.5f)
                curveTo(18.5f, 9.4428f, 18.5f, 9.9142f, 18.2071f, 10.2071f)
                curveTo(17.9142f, 10.5f, 17.4428f, 10.5f, 16.5f, 10.5f)
                horizontalLineTo(15.5f)
                curveTo(14.5572f, 10.5f, 14.0858f, 10.5f, 13.7929f, 10.2071f)
                curveTo(13.5f, 9.9142f, 13.5f, 9.4428f, 13.5f, 8.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 22.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 2.0f)
                curveTo(6.2288f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                curveTo(2.0f, 4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 2.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
            }
        }
            .build()
        return _codeScan!!
    }

private var _codeScan: ImageVector? = null
