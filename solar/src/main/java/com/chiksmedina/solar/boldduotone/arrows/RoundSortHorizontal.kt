package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.ArrowsGroup

public val ArrowsGroup.RoundSortHorizontal: ImageVector
    get() {
        if (_roundSortHorizontal != null) {
            return _roundSortHorizontal!!
        }
        _roundSortHorizontal = Builder(name = "RoundSortHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7545f, 11.4451f)
                curveTo(13.448f, 11.1664f, 12.9737f, 11.189f, 12.695f, 11.4955f)
                curveTo(12.4164f, 11.802f, 12.439f, 12.2763f, 12.7455f, 12.555f)
                lineTo(14.06f, 13.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 13.75f, 7.25f, 14.0858f, 7.25f, 14.5f)
                curveTo(7.25f, 14.9142f, 7.5858f, 15.25f, 8.0f, 15.25f)
                horizontalLineTo(14.06f)
                lineTo(12.7455f, 16.4451f)
                curveTo(12.439f, 16.7237f, 12.4164f, 17.198f, 12.695f, 17.5045f)
                curveTo(12.9737f, 17.811f, 13.448f, 17.8336f, 13.7545f, 17.555f)
                lineTo(16.5045f, 15.055f)
                curveTo(16.6609f, 14.9128f, 16.75f, 14.7113f, 16.75f, 14.5f)
                curveTo(16.75f, 14.2887f, 16.6609f, 14.0872f, 16.5045f, 13.9451f)
                lineTo(13.7545f, 11.4451f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2545f, 7.555f)
                curveTo(11.561f, 7.2763f, 11.5836f, 6.802f, 11.305f, 6.4955f)
                curveTo(11.0263f, 6.189f, 10.552f, 6.1664f, 10.2455f, 6.445f)
                lineTo(7.4955f, 8.9451f)
                curveTo(7.3391f, 9.0872f, 7.25f, 9.2887f, 7.25f, 9.5f)
                curveTo(7.25f, 9.7113f, 7.3391f, 9.9128f, 7.4955f, 10.055f)
                lineTo(10.2455f, 12.555f)
                curveTo(10.552f, 12.8336f, 11.0263f, 12.811f, 11.305f, 12.5045f)
                curveTo(11.5836f, 12.198f, 11.561f, 11.7237f, 11.2545f, 11.4451f)
                lineTo(9.94f, 10.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 10.25f, 16.75f, 9.9142f, 16.75f, 9.5f)
                curveTo(16.75f, 9.0858f, 16.4142f, 8.75f, 16.0f, 8.75f)
                horizontalLineTo(9.94f)
                lineTo(11.2545f, 7.555f)
                close()
            }
        }
        .build()
        return _roundSortHorizontal!!
    }

private var _roundSortHorizontal: ImageVector? = null
