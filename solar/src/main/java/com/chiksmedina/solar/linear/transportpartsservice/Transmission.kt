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

public val TransportPartsServiceGroup.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = Builder(name = "Transmission", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(6.0f, 5.1046f, 5.1046f, 6.0f, 4.0f, 6.0f)
                curveTo(2.8954f, 6.0f, 2.0f, 5.1046f, 2.0f, 4.0f)
                curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
                curveTo(5.1046f, 2.0f, 6.0f, 2.8954f, 6.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                curveTo(6.0f, 21.1046f, 5.1046f, 22.0f, 4.0f, 22.0f)
                curveTo(2.8954f, 22.0f, 2.0f, 21.1046f, 2.0f, 20.0f)
                curveTo(2.0f, 18.8954f, 2.8954f, 18.0f, 4.0f, 18.0f)
                curveTo(5.1046f, 18.0f, 6.0f, 18.8954f, 6.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                curveTo(14.0f, 21.1046f, 13.1046f, 22.0f, 12.0f, 22.0f)
                curveTo(10.8954f, 22.0f, 10.0f, 21.1046f, 10.0f, 20.0f)
                curveTo(10.0f, 18.8954f, 10.8954f, 18.0f, 12.0f, 18.0f)
                curveTo(13.1046f, 18.0f, 14.0f, 18.8954f, 14.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(14.0f, 5.1046f, 13.1046f, 6.0f, 12.0f, 6.0f)
                curveTo(10.8954f, 6.0f, 10.0f, 5.1046f, 10.0f, 4.0f)
                curveTo(10.0f, 2.8954f, 10.8954f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                curveTo(22.0f, 5.1046f, 21.1046f, 6.0f, 20.0f, 6.0f)
                curveTo(18.8954f, 6.0f, 18.0f, 5.1046f, 18.0f, 4.0f)
                curveTo(18.0f, 2.8954f, 18.8954f, 2.0f, 20.0f, 2.0f)
                curveTo(21.1046f, 2.0f, 22.0f, 2.8954f, 22.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 9.8856f, 20.0f, 10.8284f, 19.4142f, 11.4142f)
                curveTo(18.8284f, 12.0f, 17.8856f, 12.0f, 16.0f, 12.0f)
                horizontalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                verticalLineTo(14.25f)
                curveTo(17.5858f, 14.25f, 17.25f, 14.5858f, 17.25f, 15.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(17.25f, 22.0f)
                curveTo(17.25f, 22.4142f, 17.5858f, 22.75f, 18.0f, 22.75f)
                curveTo(18.4142f, 22.75f, 18.75f, 22.4142f, 18.75f, 22.0f)
                horizontalLineTo(17.25f)
                close()
                moveTo(21.3604f, 22.3916f)
                curveTo(21.5766f, 22.7449f, 22.0384f, 22.8559f, 22.3916f, 22.6396f)
                curveTo(22.7449f, 22.4234f, 22.8559f, 21.9616f, 22.6396f, 21.6084f)
                lineTo(21.3604f, 22.3916f)
                close()
                moveTo(18.0f, 15.75f)
                horizontalLineTo(20.2857f)
                verticalLineTo(14.25f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.75f)
                close()
                moveTo(18.75f, 18.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.25f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.75f)
                close()
                moveTo(21.25f, 16.75f)
                curveTo(21.25f, 17.3169f, 20.8038f, 17.75f, 20.2857f, 17.75f)
                verticalLineTo(19.25f)
                curveTo(21.6612f, 19.25f, 22.75f, 18.1161f, 22.75f, 16.75f)
                horizontalLineTo(21.25f)
                close()
                moveTo(20.2857f, 15.75f)
                curveTo(20.8038f, 15.75f, 21.25f, 16.1831f, 21.25f, 16.75f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 15.3839f, 21.6612f, 14.25f, 20.2857f, 14.25f)
                verticalLineTo(15.75f)
                close()
                moveTo(20.2857f, 17.75f)
                horizontalLineTo(19.8571f)
                verticalLineTo(19.25f)
                horizontalLineTo(20.2857f)
                verticalLineTo(17.75f)
                close()
                moveTo(19.8571f, 17.75f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.25f)
                horizontalLineTo(19.8571f)
                verticalLineTo(17.75f)
                close()
                moveTo(19.2175f, 18.8916f)
                lineTo(21.3604f, 22.3916f)
                lineTo(22.6396f, 21.6084f)
                lineTo(20.4968f, 18.1084f)
                lineTo(19.2175f, 18.8916f)
                close()
                moveTo(17.25f, 18.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _transmission!!
    }

private var _transmission: ImageVector? = null
