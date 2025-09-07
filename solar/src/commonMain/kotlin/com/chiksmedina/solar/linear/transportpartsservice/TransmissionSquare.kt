package com.chiksmedina.solar.linear.transportpartsservice

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
import com.chiksmedina.solar.linear.TransportPartsServiceGroup

val TransportPartsServiceGroup.TransmissionSquare: ImageVector
    get() {
        if (_transmissionSquare != null) {
            return _transmissionSquare!!
        }
        _transmissionSquare = Builder(
            name = "TransmissionSquare", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 9.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(13.9319f, 12.0f, 14.3978f, 12.0f, 14.7654f, 11.8478f)
                curveTo(15.2554f, 11.6448f, 15.6448f, 11.2554f, 15.8478f, 10.7654f)
                curveTo(16.0f, 10.3978f, 16.0f, 9.9319f, 16.0f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 22.0f, 7.0f)
                lineTo(22.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 2.0f, 17.0f)
                lineTo(2.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 2.0f)
                close()
            }
        }
            .build()
        return _transmissionSquare!!
    }

private var _transmissionSquare: ImageVector? = null
