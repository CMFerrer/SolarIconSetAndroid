package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(
            name = "Stethoscope", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 16.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(2.2514f)
                curveTo(12.8612f, 2.2531f, 12.9561f, 2.2568f, 13.0446f, 2.2646f)
                curveTo(14.8548f, 2.4246f, 16.2896f, 3.8595f, 16.4497f, 5.6697f)
                curveTo(16.4643f, 5.8351f, 16.4643f, 6.0226f, 16.4643f, 6.2979f)
                lineTo(16.4643f, 7.521f)
                curveTo(16.4643f, 11.6434f, 13.1224f, 14.9853f, 9.0f, 14.9853f)
                curveTo(4.7198f, 14.9853f, 1.25f, 11.5155f, 1.25f, 7.2353f)
                lineTo(1.25f, 6.2979f)
                curveTo(1.25f, 6.0226f, 1.25f, 5.8351f, 1.2646f, 5.6697f)
                curveTo(1.4246f, 3.8595f, 2.8595f, 2.4246f, 4.6697f, 2.2646f)
                curveTo(4.8254f, 2.2508f, 5.0005f, 2.25f, 5.25f, 2.25f)
                verticalLineTo(2.0f)
                curveTo(5.25f, 1.5858f, 5.5858f, 1.25f, 6.0f, 1.25f)
                curveTo(6.4142f, 1.25f, 6.75f, 1.5858f, 6.75f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(6.75f, 4.4142f, 6.4142f, 4.75f, 6.0f, 4.75f)
                curveTo(5.5858f, 4.75f, 5.25f, 4.4142f, 5.25f, 4.0f)
                verticalLineTo(3.75f)
                curveTo(4.9866f, 3.7502f, 4.8839f, 3.7515f, 4.8018f, 3.7587f)
                curveTo(3.7157f, 3.8548f, 2.8548f, 4.7157f, 2.7587f, 5.8018f)
                curveTo(2.7507f, 5.8924f, 2.75f, 6.008f, 2.75f, 6.3369f)
                verticalLineTo(7.2353f)
                curveTo(2.75f, 10.6871f, 5.5482f, 13.4853f, 9.0f, 13.4853f)
                curveTo(12.294f, 13.4853f, 14.9643f, 10.815f, 14.9643f, 7.521f)
                verticalLineTo(6.3369f)
                curveTo(14.9643f, 6.008f, 14.9636f, 5.8924f, 14.9555f, 5.8018f)
                curveTo(14.8595f, 4.7157f, 13.9986f, 3.8548f, 12.9125f, 3.7587f)
                curveTo(12.8702f, 3.755f, 12.8224f, 3.7529f, 12.75f, 3.7516f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(11.5858f, 4.75f, 11.25f, 4.4142f, 11.25f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.25f, 14.9495f)
                verticalLineTo(17.0001f)
                curveTo(8.25f, 20.1757f, 10.8244f, 22.7501f, 14.0f, 22.7501f)
                horizontalLineTo(14.8824f)
                curveTo(16.6952f, 22.7501f, 18.2756f, 21.7587f, 19.1126f, 20.292f)
                curveTo(19.3594f, 19.8595f, 19.4822f, 19.3963f, 19.542f, 18.9512f)
                curveTo(19.3662f, 18.9833f, 19.1851f, 19.0f, 19.0f, 19.0f)
                curveTo(18.6649f, 19.0f, 18.3426f, 18.9451f, 18.0417f, 18.8437f)
                curveTo(17.9986f, 19.1108f, 17.926f, 19.3448f, 17.8098f, 19.5486f)
                curveTo(17.2289f, 20.5666f, 16.135f, 21.2501f, 14.8824f, 21.2501f)
                horizontalLineTo(14.0f)
                curveTo(11.6528f, 21.2501f, 9.75f, 19.3473f, 9.75f, 17.0001f)
                verticalLineTo(14.9481f)
                curveTo(9.5033f, 14.9727f, 9.2531f, 14.9853f, 9.0f, 14.9853f)
                curveTo(8.747f, 14.9853f, 8.4968f, 14.9732f, 8.25f, 14.9495f)
                close()
            }
        }
            .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
