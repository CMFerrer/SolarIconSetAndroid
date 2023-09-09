package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.HashtagSquare: ImageVector
    get() {
        if (_hashtagSquare != null) {
            return _hashtagSquare!!
        }
        _hashtagSquare = Builder(name = "HashtagSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.092f, 10.75f)
                lineTo(13.342f, 13.25f)
                horizontalLineTo(9.908f)
                lineTo(10.658f, 10.75f)
                horizontalLineTo(14.092f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(11.2155f, 6.2816f)
                curveTo(11.6123f, 6.4007f, 11.8374f, 6.8188f, 11.7184f, 7.2155f)
                lineTo(11.108f, 9.25f)
                horizontalLineTo(14.542f)
                lineTo(15.2816f, 6.7845f)
                curveTo(15.4007f, 6.3878f, 15.8188f, 6.1626f, 16.2155f, 6.2816f)
                curveTo(16.6123f, 6.4007f, 16.8374f, 6.8188f, 16.7184f, 7.2155f)
                lineTo(16.108f, 9.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 9.25f, 18.75f, 9.5858f, 18.75f, 10.0f)
                curveTo(18.75f, 10.4142f, 18.4142f, 10.75f, 18.0f, 10.75f)
                horizontalLineTo(15.658f)
                lineTo(14.908f, 13.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 13.25f, 17.75f, 13.5858f, 17.75f, 14.0f)
                curveTo(17.75f, 14.4142f, 17.4142f, 14.75f, 17.0f, 14.75f)
                horizontalLineTo(14.458f)
                lineTo(13.7184f, 17.2155f)
                curveTo(13.5993f, 17.6123f, 13.1812f, 17.8374f, 12.7845f, 17.7184f)
                curveTo(12.3877f, 17.5994f, 12.1626f, 17.1812f, 12.2816f, 16.7845f)
                lineTo(12.892f, 14.75f)
                horizontalLineTo(9.458f)
                lineTo(8.7184f, 17.2155f)
                curveTo(8.5993f, 17.6123f, 8.1812f, 17.8374f, 7.7845f, 17.7184f)
                curveTo(7.3877f, 17.5994f, 7.1626f, 17.1812f, 7.2816f, 16.7845f)
                lineTo(7.892f, 14.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 14.75f, 5.25f, 14.4142f, 5.25f, 14.0f)
                curveTo(5.25f, 13.5858f, 5.5858f, 13.25f, 6.0f, 13.25f)
                horizontalLineTo(8.342f)
                lineTo(9.092f, 10.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 10.75f, 6.25f, 10.4142f, 6.25f, 10.0f)
                curveTo(6.25f, 9.5858f, 6.5858f, 9.25f, 7.0f, 9.25f)
                horizontalLineTo(9.542f)
                lineTo(10.2816f, 6.7845f)
                curveTo(10.4007f, 6.3878f, 10.8188f, 6.1626f, 11.2155f, 6.2816f)
                close()
            }
        }
        .build()
        return _hashtagSquare!!
    }

private var _hashtagSquare: ImageVector? = null
