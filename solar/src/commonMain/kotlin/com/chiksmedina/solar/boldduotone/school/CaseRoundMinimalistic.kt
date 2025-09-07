package com.chiksmedina.solar.boldduotone.school

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
import com.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.CaseRoundMinimalistic: ImageVector
    get() {
        if (_caseRoundMinimalistic != null) {
            return _caseRoundMinimalistic!!
        }
        _caseRoundMinimalistic = Builder(
            name = "CaseRoundMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.8776f, 4.2499f)
                curveTo(10.1869f, 3.375f, 11.0213f, 2.75f, 11.9998f, 2.75f)
                curveTo(12.9783f, 2.75f, 13.8127f, 3.375f, 14.122f, 4.2499f)
                curveTo(14.26f, 4.6405f, 14.6885f, 4.8452f, 15.079f, 4.7071f)
                curveTo(15.4696f, 4.5691f, 15.6742f, 4.1406f, 15.5362f, 3.7501f)
                curveTo(15.0218f, 2.2946f, 13.6337f, 1.25f, 11.9998f, 1.25f)
                curveTo(10.3658f, 1.25f, 8.9778f, 2.2946f, 8.4634f, 3.7501f)
                curveTo(8.3253f, 4.1406f, 8.53f, 4.5691f, 8.9206f, 4.7071f)
                curveTo(9.3111f, 4.8452f, 9.7396f, 4.6405f, 9.8776f, 4.2499f)
                close()
                moveTo(2.7471f, 8.091f)
                curveTo(2.6937f, 8.0563f, 2.6377f, 8.0293f, 2.5801f, 8.0097f)
                curveTo(2.7332f, 7.692f, 2.9268f, 7.4162f, 3.1714f, 7.1716f)
                curveTo(4.343f, 6.0f, 6.2286f, 6.0f, 9.9999f, 6.0f)
                horizontalLineTo(13.9999f)
                curveTo(17.7711f, 6.0f, 19.6567f, 6.0f, 20.8283f, 7.1716f)
                curveTo(21.073f, 7.4163f, 21.2666f, 7.6921f, 21.4197f, 8.0098f)
                curveTo(21.3623f, 8.0294f, 21.3063f, 8.0564f, 21.253f, 8.091f)
                curveTo(19.1526f, 9.4563f, 17.833f, 10.3102f, 16.7364f, 10.858f)
                curveTo(16.6701f, 10.5117f, 16.3655f, 10.25f, 15.9999f, 10.25f)
                curveTo(15.5857f, 10.25f, 15.2499f, 10.5858f, 15.2499f, 11.0f)
                verticalLineTo(11.4581f)
                curveTo(13.1304f, 12.0976f, 10.8693f, 12.0976f, 8.7499f, 11.458f)
                verticalLineTo(11.0f)
                curveTo(8.7499f, 10.5858f, 8.4141f, 10.25f, 7.9999f, 10.25f)
                curveTo(7.6343f, 10.25f, 7.3298f, 10.5116f, 7.2633f, 10.8578f)
                curveTo(6.1669f, 10.31f, 4.8473f, 9.4561f, 2.7471f, 8.091f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 13.9998f)
                curveTo(2.0f, 12.0494f, 2.0f, 10.6033f, 2.1621f, 9.4995f)
                curveTo(4.4388f, 10.9794f, 5.898f, 11.9231f, 7.25f, 12.5044f)
                verticalLineTo(12.9998f)
                curveTo(7.25f, 13.414f, 7.5858f, 13.7498f, 8.0f, 13.7498f)
                curveTo(8.4087f, 13.7498f, 8.7411f, 13.4229f, 8.7498f, 13.0163f)
                curveTo(10.8801f, 13.5779f, 13.1199f, 13.5779f, 15.2502f, 13.0163f)
                curveTo(15.259f, 13.4229f, 15.5913f, 13.7498f, 16.0f, 13.7498f)
                curveTo(16.4142f, 13.7498f, 16.75f, 13.414f, 16.75f, 12.9998f)
                verticalLineTo(12.5045f)
                curveTo(18.1021f, 11.9233f, 19.5613f, 10.9796f, 21.8379f, 9.4997f)
                curveTo(22.0f, 10.6035f, 22.0f, 12.0495f, 22.0f, 13.9998f)
                curveTo(22.0f, 17.7711f, 22.0f, 19.6567f, 20.8284f, 20.8283f)
                curveTo(19.6569f, 21.9998f, 17.7712f, 21.9998f, 14.0f, 21.9998f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 21.9998f, 4.3432f, 21.9998f, 3.1716f, 20.8283f)
                curveTo(2.0f, 19.6567f, 2.0f, 17.7711f, 2.0f, 13.9998f)
                close()
            }
        }
            .build()
        return _caseRoundMinimalistic!!
    }

private var _caseRoundMinimalistic: ImageVector? = null
