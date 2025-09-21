package dev.chiksmedina.solar.linear.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.SportsGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 9.0f)
                lineTo(15.5f, 15.0f)
                curveTo(15.5f, 15.465f, 15.5f, 15.6975f, 15.5511f, 15.8882f)
                curveTo(15.6898f, 16.4059f, 16.0941f, 16.8102f, 16.6118f, 16.9489f)
                curveTo(16.8025f, 17.0f, 17.035f, 17.0f, 17.5f, 17.0f)
                curveTo(17.965f, 17.0f, 18.1975f, 17.0f, 18.3882f, 16.9489f)
                curveTo(18.9059f, 16.8102f, 19.3102f, 16.4059f, 19.4489f, 15.8882f)
                curveTo(19.5f, 15.6975f, 19.5f, 15.465f, 19.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(19.5f, 8.535f, 19.5f, 8.3025f, 19.4489f, 8.1118f)
                curveTo(19.3102f, 7.5941f, 18.9059f, 7.1898f, 18.3882f, 7.0511f)
                curveTo(18.1975f, 7.0f, 17.965f, 7.0f, 17.5f, 7.0f)
                curveTo(17.035f, 7.0f, 16.8025f, 7.0f, 16.6118f, 7.0511f)
                curveTo(16.0941f, 7.1898f, 15.6898f, 7.5941f, 15.5511f, 8.1118f)
                curveTo(15.5f, 8.3025f, 15.5f, 8.535f, 15.5f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 9.0f)
                lineTo(4.5f, 15.0f)
                curveTo(4.5f, 15.465f, 4.5f, 15.6975f, 4.5511f, 15.8882f)
                curveTo(4.6898f, 16.4059f, 5.0941f, 16.8102f, 5.6118f, 16.9489f)
                curveTo(5.8025f, 17.0f, 6.035f, 17.0f, 6.5f, 17.0f)
                curveTo(6.965f, 17.0f, 7.1975f, 17.0f, 7.3882f, 16.9489f)
                curveTo(7.9059f, 16.8102f, 8.3102f, 16.4059f, 8.4489f, 15.8882f)
                curveTo(8.5f, 15.6975f, 8.5f, 15.465f, 8.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(8.5f, 8.535f, 8.5f, 8.3025f, 8.4489f, 8.1118f)
                curveTo(8.3102f, 7.5941f, 7.9059f, 7.1898f, 7.3882f, 7.0511f)
                curveTo(7.1975f, 7.0f, 6.965f, 7.0f, 6.5f, 7.0f)
                curveTo(6.035f, 7.0f, 5.8025f, 7.0f, 5.6118f, 7.0511f)
                curveTo(5.0941f, 7.1898f, 4.6898f, 7.5941f, 4.5511f, 8.1118f)
                curveTo(4.5f, 8.3025f, 4.5f, 8.535f, 4.5f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 10.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 10.0f, 2.0f, 10.8954f, 2.0f, 12.0f)
                curveTo(2.0f, 13.1046f, 2.8954f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(5.0f)
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
                moveTo(19.0f, 14.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 14.0f, 22.0f, 13.1046f, 22.0f, 12.0f)
                curveTo(22.0f, 10.8954f, 21.1046f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(19.0f)
            }
        }
            .build()
        return _dumbbellSmall!!
    }

private var _dumbbellSmall: ImageVector? = null
