package com.chiksmedina.solar.broken.maplocation

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
import com.chiksmedina.solar.broken.MapLocationGroup

public val MapLocationGroup.PointOnMap: ImageVector
    get() {
        if (_pointOnMap != null) {
            return _pointOnMap!!
        }
        _pointOnMap = Builder(name = "PointOnMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 13.1623f)
                curveTo(21.0f, 12.1187f, 21.0f, 9.5969f, 20.7169f, 9.2041f)
                curveTo(20.4337f, 8.8112f, 19.9387f, 8.6462f, 18.9487f, 8.3162f)
                lineTo(18.0f, 8.0f)
                moveTo(21.0f, 16.829f)
                curveTo(21.0f, 18.1199f, 21.0f, 18.7653f, 20.6603f, 19.18f)
                curveTo(20.5449f, 19.3208f, 20.4048f, 19.4394f, 20.247f, 19.5301f)
                curveTo(19.7821f, 19.797f, 19.1455f, 19.6909f, 17.8721f, 19.4787f)
                curveTo(16.6157f, 19.2693f, 15.9875f, 19.1646f, 15.3648f, 19.2167f)
                curveTo(15.1463f, 19.235f, 14.9292f, 19.2676f, 14.715f, 19.3144f)
                curveTo(14.1046f, 19.4477f, 13.5299f, 19.735f, 12.3806f, 20.3097f)
                curveTo(10.8809f, 21.0596f, 10.131f, 21.4345f, 9.3328f, 21.5501f)
                curveTo(9.0924f, 21.5849f, 8.8498f, 21.6021f, 8.6069f, 21.6016f)
                curveTo(7.8004f, 21.6001f, 7.0119f, 21.3373f, 5.4349f, 20.8116f)
                lineTo(5.0513f, 20.6838f)
                curveTo(4.0613f, 20.3538f, 3.5663f, 20.1888f, 3.2831f, 19.7959f)
                curveTo(3.0f, 19.4031f, 3.0f, 18.8813f, 3.0f, 17.8377f)
                verticalLineTo(17.0f)
                moveTo(3.0f, 12.908f)
                curveTo(3.0f, 11.2491f, 3.0f, 10.4197f, 3.4884f, 9.9736f)
                curveTo(3.5739f, 9.8955f, 3.6681f, 9.8276f, 3.7692f, 9.7712f)
                curveTo(4.2843f, 9.4838f, 4.9657f, 9.6613f, 6.2231f, 10.075f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.25f, 11.2513f)
                curveTo(17.7356f, 10.0935f, 18.0f, 8.8609f, 18.0f, 7.7003f)
                curveTo(18.0f, 4.5521f, 15.3137f, 2.0f, 12.0f, 2.0f)
                curveTo(8.6863f, 2.0f, 6.0f, 4.5521f, 6.0f, 7.7003f)
                curveTo(6.0f, 10.8238f, 7.915f, 14.4687f, 10.9028f, 15.7721f)
                curveTo(11.5993f, 16.076f, 12.4007f, 16.076f, 13.0972f, 15.7721f)
                curveTo(14.0514f, 15.3558f, 14.8963f, 14.7007f, 15.6042f, 13.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _pointOnMap!!
    }

private var _pointOnMap: ImageVector? = null
