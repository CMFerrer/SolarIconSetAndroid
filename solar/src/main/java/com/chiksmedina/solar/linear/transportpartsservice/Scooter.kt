package com.chiksmedina.solar.linear.transportpartsservice

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
import com.chiksmedina.solar.linear.TransportPartsServiceGroup

public val TransportPartsServiceGroup.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                lineTo(19.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 16.0f)
                lineTo(22.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(11.0f, 12.6144f, 11.0f, 11.6716f, 10.4142f, 11.0858f)
                curveTo(9.8284f, 10.5f, 8.8856f, 10.5f, 7.0f, 10.5f)
                horizontalLineTo(6.4f)
                curveTo(6.0286f, 10.5f, 5.8428f, 10.5f, 5.6862f, 10.5123f)
                curveTo(3.7247f, 10.6667f, 2.1667f, 12.2247f, 2.0123f, 14.1862f)
                curveTo(2.0f, 14.3428f, 2.0f, 14.5286f, 2.0f, 14.9f)
                curveTo(2.0f, 14.9929f, 2.0f, 15.0393f, 2.0031f, 15.0785f)
                curveTo(2.0417f, 15.5688f, 2.4312f, 15.9583f, 2.9215f, 15.9969f)
                curveTo(2.9607f, 16.0f, 3.0071f, 16.0f, 3.1f, 16.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 16.0f)
                curveTo(9.5f, 17.6569f, 8.1568f, 19.0f, 6.5f, 19.0f)
                curveTo(4.8432f, 19.0f, 3.5f, 17.6569f, 3.5f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                horizontalLineTo(12.5279f)
                curveTo(13.7307f, 5.0f, 14.3321f, 5.0f, 14.8154f, 5.2987f)
                curveTo(15.2987f, 5.5974f, 15.5677f, 6.1353f, 16.1056f, 7.2111f)
                lineTo(19.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.1426f, 11.0f)
                lineTo(18.8243f, 10.4978f)
                curveTo(19.0871f, 10.3041f, 19.2186f, 10.2073f, 19.31f, 10.0811f)
                curveTo(19.3722f, 9.9952f, 19.4203f, 9.8999f, 19.4526f, 9.7989f)
                curveTo(19.5f, 9.6505f, 19.5f, 9.4872f, 19.5f, 9.1607f)
                curveTo(19.5f, 8.5433f, 19.5f, 8.2346f, 19.3684f, 8.0041f)
                curveTo(19.2797f, 7.8489f, 19.1511f, 7.7203f, 18.996f, 7.6316f)
                curveTo(18.7654f, 7.5f, 18.4567f, 7.5f, 17.8393f, 7.5f)
                horizontalLineTo(16.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
