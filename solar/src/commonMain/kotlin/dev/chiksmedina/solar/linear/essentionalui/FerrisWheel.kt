package dev.chiksmedina.solar.linear.essentionalui

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
import dev.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.FerrisWheel: ImageVector
    get() {
        if (_ferrisWheel != null) {
            return _ferrisWheel!!
        }
        _ferrisWheel = Builder(
            name = "FerrisWheel", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 7.5f)
                curveTo(20.5f, 8.0523f, 20.0523f, 8.5f, 19.5f, 8.5f)
                curveTo(18.9477f, 8.5f, 18.5f, 8.0523f, 18.5f, 7.5f)
                curveTo(18.5f, 6.9477f, 18.9477f, 6.5f, 19.5f, 6.5f)
                curveTo(20.0523f, 6.5f, 20.5f, 6.9477f, 20.5f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 16.0f)
                curveTo(20.5f, 16.5523f, 20.0523f, 17.0f, 19.5f, 17.0f)
                curveTo(18.9477f, 17.0f, 18.5f, 16.5523f, 18.5f, 16.0f)
                curveTo(18.5f, 15.4477f, 18.9477f, 15.0f, 19.5f, 15.0f)
                curveTo(20.0523f, 15.0f, 20.5f, 15.4477f, 20.5f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 7.5f)
                curveTo(5.5f, 8.0523f, 5.0523f, 8.5f, 4.5f, 8.5f)
                curveTo(3.9477f, 8.5f, 3.5f, 8.0523f, 3.5f, 7.5f)
                curveTo(3.5f, 6.9477f, 3.9477f, 6.5f, 4.5f, 6.5f)
                curveTo(5.0523f, 6.5f, 5.5f, 6.9477f, 5.5f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 16.0f)
                curveTo(5.5f, 16.5523f, 5.0523f, 17.0f, 4.5f, 17.0f)
                curveTo(3.9477f, 17.0f, 3.5f, 16.5523f, 3.5f, 16.0f)
                curveTo(3.5f, 15.4477f, 3.9477f, 15.0f, 4.5f, 15.0f)
                curveTo(5.0523f, 15.0f, 5.5f, 15.4477f, 5.5f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.5f)
                curveTo(12.5523f, 2.5f, 13.0f, 2.9477f, 13.0f, 3.5f)
                curveTo(13.0f, 4.0523f, 12.5523f, 4.5f, 12.0f, 4.5f)
                curveTo(11.4477f, 4.5f, 11.0f, 4.0523f, 11.0f, 3.5f)
                curveTo(11.0f, 2.9477f, 11.4477f, 2.5f, 12.0f, 2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.5f)
                curveTo(12.5523f, 18.5f, 13.0f, 18.9477f, 13.0f, 19.5f)
                curveTo(13.0f, 20.0523f, 12.5523f, 20.5f, 12.0f, 20.5f)
                curveTo(11.4477f, 20.5f, 11.0f, 20.0523f, 11.0f, 19.5f)
                curveTo(11.0f, 18.9477f, 11.4477f, 18.5f, 12.0f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 13.0f)
                lineTo(18.5f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 13.0f)
                lineTo(5.5f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5638f, 3.7831f)
                curveTo(11.4591f, 3.295f, 12.541f, 3.295f, 13.4362f, 3.7831f)
                lineTo(18.2304f, 6.3973f)
                curveTo(19.1944f, 6.9229f, 19.7942f, 7.9332f, 19.7942f, 9.0312f)
                verticalLineTo(13.9688f)
                curveTo(19.7942f, 15.0668f, 19.1944f, 16.0771f, 18.2304f, 16.6027f)
                lineTo(13.4362f, 19.2169f)
                curveTo(12.541f, 19.705f, 11.4591f, 19.705f, 10.5638f, 19.2169f)
                lineTo(5.7696f, 16.6027f)
                curveTo(4.8056f, 16.0771f, 4.2058f, 15.0668f, 4.2058f, 13.9688f)
                verticalLineTo(9.0312f)
                curveTo(4.2058f, 7.9332f, 4.8056f, 6.9229f, 5.7696f, 6.3973f)
                lineTo(10.5638f, 3.7831f)
                close()
            }
        }
            .build()
        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
