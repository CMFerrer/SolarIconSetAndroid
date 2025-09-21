package dev.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(
            name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.8044f, 9.11f)
                lineTo(14.8901f, 6.1956f)
                curveTo(14.0906f, 5.3961f, 13.6908f, 4.9964f, 13.2363f, 4.831f)
                curveTo(12.7542f, 4.6555f, 12.2258f, 4.6555f, 11.7437f, 4.831f)
                curveTo(11.2891f, 4.9964f, 10.8894f, 5.3961f, 10.0899f, 6.1956f)
                lineTo(5.5469f, 10.7386f)
                curveTo(3.4166f, 12.8689f, 3.4166f, 16.3228f, 5.5469f, 18.4531f)
                curveTo(7.6772f, 20.5834f, 11.1311f, 20.5834f, 13.2614f, 18.4531f)
                lineTo(17.8044f, 13.9101f)
                curveTo(18.6039f, 13.1107f, 19.0036f, 12.7109f, 19.1691f, 12.2563f)
                curveTo(19.3445f, 11.7743f, 19.3445f, 11.2458f, 19.1691f, 10.7638f)
                curveTo(19.0036f, 10.3092f, 18.6039f, 9.9095f, 17.8044f, 9.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(16.5561f, 3.233f)
                curveTo(16.8667f, 2.9223f, 17.3705f, 2.9223f, 17.6811f, 3.233f)
                lineTo(20.7669f, 6.3188f)
                curveTo(21.0776f, 6.6295f, 21.0776f, 7.1332f, 20.7669f, 7.4439f)
                curveTo(20.4563f, 7.7546f, 19.9525f, 7.7546f, 19.6418f, 7.4439f)
                lineTo(16.5561f, 4.3581f)
                curveTo(16.2454f, 4.0474f, 16.2454f, 3.5437f, 16.5561f, 3.233f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.7292f, 13.9852f)
                lineTo(10.0147f, 6.2708f)
                lineTo(8.8897f, 7.3958f)
                lineTo(16.6041f, 15.1103f)
                lineTo(17.7292f, 13.9852f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0257f, 17.8496f)
                curveTo(5.1825f, 18.0601f, 5.3565f, 18.2619f, 5.5476f, 18.453f)
                curveTo(5.7387f, 18.644f, 5.9404f, 18.8179f, 6.1508f, 18.9747f)
                lineTo(4.3581f, 20.7673f)
                curveTo(4.0475f, 21.078f, 3.5437f, 21.078f, 3.233f, 20.7673f)
                curveTo(2.9223f, 20.4567f, 2.9223f, 19.9529f, 3.233f, 19.6422f)
                lineTo(5.0257f, 17.8496f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.9093f, 8.2149f)
                lineTo(15.7842f, 7.0898f)
                lineTo(17.5359f, 5.3381f)
                lineTo(18.661f, 6.4632f)
                lineTo(16.9093f, 8.2149f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.3671f, 16.3478f)
                curveTo(15.3671f, 16.3478f, 15.3671f, 16.3479f, 15.3671f, 16.3478f)
                lineTo(12.3065f, 13.2872f)
                curveTo(11.9958f, 12.9765f, 11.4921f, 12.9765f, 11.1814f, 13.2872f)
                curveTo(10.8707f, 13.5979f, 10.8707f, 14.1016f, 11.1814f, 14.4123f)
                lineTo(14.242f, 17.4729f)
                curveTo(14.242f, 17.4729f, 14.242f, 17.4729f, 14.242f, 17.4729f)
                lineTo(15.3671f, 16.3478f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.6314f, 18.0836f)
                curveTo(13.6314f, 18.0836f, 13.6314f, 18.0836f, 13.6314f, 18.0836f)
                lineTo(11.8854f, 16.3377f)
                curveTo(11.5748f, 16.027f, 11.071f, 16.027f, 10.7604f, 16.3377f)
                curveTo(10.4497f, 16.6484f, 10.4497f, 17.1521f, 10.7604f, 17.4628f)
                lineTo(12.4323f, 19.1348f)
                curveTo(12.7251f, 18.939f, 13.0032f, 18.7118f, 13.2617f, 18.4533f)
                lineTo(13.6314f, 18.0836f)
                close()
            }
        }
            .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
