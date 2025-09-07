package com.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SportsGroup

val SportsGroup.DumbbellSmall: ImageVector
    get() {
        if (_dumbbellSmall != null) {
            return _dumbbellSmall!!
        }
        _dumbbellSmall = Builder(
            name = "DumbbellSmall", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.068f, 2.6374f, 10.285f, 3.5001f, 10.063f)
                lineTo(3.5001f, 13.937f)
                curveTo(2.6374f, 13.715f, 2.0f, 12.932f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 12.9319f, 21.3626f, 13.715f, 20.4999f, 13.937f)
                verticalLineTo(10.063f)
                curveTo(21.3626f, 10.285f, 22.0f, 11.0681f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 15.465f, 19.0f, 15.6975f, 18.9489f, 15.8882f)
                curveTo(18.8102f, 16.4059f, 18.4059f, 16.8102f, 17.8882f, 16.9489f)
                curveTo(17.6975f, 17.0f, 17.465f, 17.0f, 17.0f, 17.0f)
                curveTo(16.535f, 17.0f, 16.3025f, 17.0f, 16.1118f, 16.9489f)
                curveTo(15.5941f, 16.8102f, 15.1898f, 16.4059f, 15.0511f, 15.8882f)
                curveTo(15.0f, 15.6975f, 15.0f, 15.465f, 15.0f, 15.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 15.465f, 9.0f, 15.6975f, 8.9489f, 15.8882f)
                curveTo(8.8102f, 16.4059f, 8.4059f, 16.8102f, 7.8882f, 16.9489f)
                curveTo(7.6975f, 17.0f, 7.465f, 17.0f, 7.0f, 17.0f)
                curveTo(6.535f, 17.0f, 6.3025f, 17.0f, 6.1118f, 16.9489f)
                curveTo(5.5941f, 16.8102f, 5.1898f, 16.4059f, 5.0511f, 15.8882f)
                curveTo(5.0f, 15.6975f, 5.0f, 15.465f, 5.0f, 15.0f)
                lineTo(5.0f, 9.0f)
                curveTo(5.0f, 8.535f, 5.0f, 8.3025f, 5.0511f, 8.1118f)
                curveTo(5.1898f, 7.5941f, 5.5941f, 7.1898f, 6.1118f, 7.0511f)
                curveTo(6.3025f, 7.0f, 6.535f, 7.0f, 7.0f, 7.0f)
                curveTo(7.465f, 7.0f, 7.6975f, 7.0f, 7.8882f, 7.0511f)
                curveTo(8.4059f, 7.1898f, 8.8102f, 7.5941f, 8.9489f, 8.1118f)
                curveTo(9.0f, 8.3025f, 9.0f, 8.535f, 9.0f, 9.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                curveTo(15.0f, 8.535f, 15.0f, 8.3025f, 15.0511f, 8.1118f)
                curveTo(15.1898f, 7.5941f, 15.5941f, 7.1898f, 16.1118f, 7.0511f)
                curveTo(16.3025f, 7.0f, 16.535f, 7.0f, 17.0f, 7.0f)
                curveTo(17.465f, 7.0f, 17.6975f, 7.0f, 17.8882f, 7.0511f)
                curveTo(18.4059f, 7.1898f, 18.8102f, 7.5941f, 18.9489f, 8.1118f)
                curveTo(19.0f, 8.3025f, 19.0f, 8.535f, 19.0f, 9.0f)
                close()
            }
        }
            .build()
        return _dumbbellSmall!!
    }

private var _dumbbellSmall: ImageVector? = null
