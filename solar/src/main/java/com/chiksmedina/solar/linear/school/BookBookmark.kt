package com.chiksmedina.solar.linear.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SchoolGroup

public val SchoolGroup.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 5.1716f, 4.0f, 3.7574f, 4.8787f, 2.8787f)
                curveTo(5.7574f, 2.0f, 7.1716f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8284f, 2.0f, 18.2426f, 2.0f, 19.1213f, 2.8787f)
                curveTo(20.0f, 3.7574f, 20.0f, 5.1716f, 20.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 18.8284f, 20.0f, 20.2426f, 19.1213f, 21.1213f)
                curveTo(18.2426f, 22.0f, 16.8284f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(7.1716f, 22.0f, 5.7574f, 22.0f, 4.8787f, 21.1213f)
                curveTo(4.0f, 20.2426f, 4.0f, 18.8284f, 4.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8978f, 16.0f)
                horizontalLineTo(7.8978f)
                curveTo(6.9678f, 16.0f, 6.5028f, 16.0f, 6.1213f, 16.1022f)
                curveTo(5.086f, 16.3796f, 4.2774f, 17.1883f, 4.0f, 18.2235f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 10.5f)
                horizontalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 16.0f)
                verticalLineTo(19.5309f)
                curveTo(13.0f, 19.8065f, 13.0f, 19.9443f, 12.9051f, 20.0f)
                curveTo(12.8103f, 20.0557f, 12.6806f, 19.9941f, 12.4211f, 19.8708f)
                lineTo(11.1789f, 19.2808f)
                curveTo(11.0911f, 19.2391f, 11.0472f, 19.2182f, 11.0f, 19.2182f)
                curveTo(10.9528f, 19.2182f, 10.9089f, 19.2391f, 10.8211f, 19.2808f)
                lineTo(9.5789f, 19.8708f)
                curveTo(9.3194f, 19.9941f, 9.1897f, 20.0557f, 9.0948f, 20.0f)
                curveTo(9.0f, 19.9443f, 9.0f, 19.8065f, 9.0f, 19.5309f)
                verticalLineTo(16.45f)
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
