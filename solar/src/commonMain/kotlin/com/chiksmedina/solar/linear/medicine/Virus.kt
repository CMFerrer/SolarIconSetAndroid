package com.chiksmedina.solar.linear.medicine

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
import com.chiksmedina.solar.linear.MedicineGroup

val MedicineGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(
            name = "Virus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0565f, 18.9998f)
                curveTo(15.9224f, 19.031f, 19.031f, 15.9224f, 18.9998f, 12.0565f)
                curveTo(18.9686f, 8.1906f, 15.8094f, 5.0314f, 11.9435f, 5.0002f)
                curveTo(8.0777f, 4.969f, 4.969f, 8.0777f, 5.0002f, 11.9435f)
                curveTo(5.0314f, 15.8094f, 8.1906f, 18.9686f, 12.0565f, 18.9998f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 6.0f)
                lineTo(16.95f, 7.05f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 5.0f)
                lineTo(7.0f, 7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0498f, 18.0498f)
                lineTo(16.5f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 19.0498f)
                lineTo(7.05f, 17.9998f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 13.0f)
                curveTo(16.5f, 14.1046f, 15.6046f, 15.0f, 14.5f, 15.0f)
                curveTo(13.3954f, 15.0f, 12.5f, 14.1046f, 12.5f, 13.0f)
                curveTo(12.5f, 11.8954f, 13.3954f, 11.0f, 14.5f, 11.0f)
                curveTo(15.6046f, 11.0f, 16.5f, 11.8954f, 16.5f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 9.0f)
                curveTo(11.0f, 9.5523f, 10.5523f, 10.0f, 10.0f, 10.0f)
                curveTo(9.4477f, 10.0f, 9.0f, 9.5523f, 9.0f, 9.0f)
                curveTo(9.0f, 8.4477f, 9.4477f, 8.0f, 10.0f, 8.0f)
                curveTo(10.5523f, 8.0f, 11.0f, 8.4477f, 11.0f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 4.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.5f, 3.5f)
                moveToRelative(1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 12.8284f, 2.6716f, 13.5f, 3.5f, 13.5f)
                curveTo(4.3284f, 13.5f, 5.0f, 12.8284f, 5.0f, 12.0f)
                curveTo(5.0f, 11.1716f, 4.3284f, 10.5f, 3.5f, 10.5f)
                curveTo(2.6716f, 10.5f, 2.0f, 11.1716f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5498f, 19.5498f)
                moveToRelative(-1.5f, -0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, -0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, -0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 20.5f)
                moveToRelative(1.5f, -0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, -0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, -0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 3.5f)
                curveTo(13.5f, 4.3284f, 12.8284f, 5.0f, 12.0f, 5.0f)
                curveTo(11.1716f, 5.0f, 10.5f, 4.3284f, 10.5f, 3.5f)
                curveTo(10.5f, 2.6716f, 11.1716f, 2.0f, 12.0f, 2.0f)
                curveTo(12.8284f, 2.0f, 13.5f, 2.6716f, 13.5f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 13.4999f)
                curveTo(20.3284f, 13.4999f, 21.0f, 12.8283f, 21.0f, 11.9999f)
                curveTo(21.0f, 11.1715f, 20.3284f, 10.4999f, 19.5f, 10.4999f)
                curveTo(19.3247f, 10.4999f, 19.1564f, 10.53f, 19.0f, 10.5852f)
                verticalLineTo(13.4145f)
                curveTo(19.1564f, 13.4698f, 19.3247f, 13.4999f, 19.5f, 13.4999f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5853f, 19.0f)
                curveTo(10.7912f, 19.5826f, 11.3469f, 20.0001f, 12.0f, 20.0001f)
                curveTo(12.6531f, 20.0001f, 13.2088f, 19.5826f, 13.4147f, 19.0f)
                lineTo(10.5853f, 19.0f)
                close()
            }
        }
            .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
