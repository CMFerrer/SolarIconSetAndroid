package com.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(
            name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 4.0f, 19.6569f, 4.0f, 20.8284f, 5.1716f)
                curveTo(22.0f, 6.3432f, 22.0f, 8.2288f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.7504f, 10.0f)
                curveTo(12.7504f, 9.5858f, 12.4146f, 9.25f, 12.0004f, 9.25f)
                curveTo(11.5861f, 9.25f, 11.2504f, 9.5858f, 11.2504f, 10.0f)
                verticalLineTo(10.7012f)
                lineTo(10.6429f, 10.3505f)
                curveTo(10.2842f, 10.1434f, 9.8255f, 10.2663f, 9.6184f, 10.625f)
                curveTo(9.4113f, 10.9837f, 9.5342f, 11.4424f, 9.8929f, 11.6495f)
                lineTo(10.4999f, 11.9999f)
                lineTo(9.8927f, 12.3505f)
                curveTo(9.534f, 12.5576f, 9.4111f, 13.0163f, 9.6182f, 13.375f)
                curveTo(9.8253f, 13.7337f, 10.284f, 13.8566f, 10.6427f, 13.6495f)
                lineTo(11.2504f, 13.2987f)
                verticalLineTo(14.0f)
                curveTo(11.2504f, 14.4142f, 11.5861f, 14.75f, 12.0004f, 14.75f)
                curveTo(12.4146f, 14.75f, 12.7504f, 14.4142f, 12.7504f, 14.0f)
                verticalLineTo(13.2993f)
                lineTo(13.357f, 13.6495f)
                curveTo(13.7158f, 13.8566f, 14.1745f, 13.7337f, 14.3816f, 13.375f)
                curveTo(14.5887f, 13.0163f, 14.4658f, 12.5576f, 14.107f, 12.3505f)
                lineTo(13.4999f, 11.9999f)
                lineTo(14.1068f, 11.6495f)
                curveTo(14.4655f, 11.4424f, 14.5884f, 10.9837f, 14.3813f, 10.625f)
                curveTo(14.1742f, 10.2663f, 13.7155f, 10.1434f, 13.3568f, 10.3505f)
                lineTo(12.7504f, 10.7006f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.7328f, 9.25f)
                curveTo(7.147f, 9.25f, 7.4828f, 9.5858f, 7.4828f, 10.0f)
                verticalLineTo(10.7006f)
                lineTo(8.0892f, 10.3505f)
                curveTo(8.448f, 10.1434f, 8.9066f, 10.2663f, 9.1138f, 10.625f)
                curveTo(9.3209f, 10.9837f, 9.198f, 11.4424f, 8.8392f, 11.6495f)
                lineTo(8.2323f, 11.9999f)
                lineTo(8.8395f, 12.3505f)
                curveTo(9.1982f, 12.5576f, 9.3211f, 13.0163f, 9.114f, 13.375f)
                curveTo(8.9069f, 13.7337f, 8.4482f, 13.8566f, 8.0895f, 13.6495f)
                lineTo(7.4828f, 13.2993f)
                verticalLineTo(14.0f)
                curveTo(7.4828f, 14.4142f, 7.147f, 14.75f, 6.7328f, 14.75f)
                curveTo(6.3186f, 14.75f, 5.9828f, 14.4142f, 5.9828f, 14.0f)
                verticalLineTo(13.2987f)
                lineTo(5.3751f, 13.6495f)
                curveTo(5.0164f, 13.8566f, 4.5577f, 13.7337f, 4.3506f, 13.375f)
                curveTo(4.1435f, 13.0163f, 4.2664f, 12.5576f, 4.6251f, 12.3505f)
                lineTo(5.2323f, 11.9999f)
                lineTo(4.6254f, 11.6495f)
                curveTo(4.2666f, 11.4424f, 4.1437f, 10.9837f, 4.3508f, 10.625f)
                curveTo(4.558f, 10.2663f, 5.0166f, 10.1434f, 5.3754f, 10.3505f)
                lineTo(5.9828f, 10.7012f)
                verticalLineTo(10.0f)
                curveTo(5.9828f, 9.5858f, 6.3186f, 9.25f, 6.7328f, 9.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0182f, 10.0f)
                curveTo(18.0182f, 9.5858f, 17.6824f, 9.25f, 17.2682f, 9.25f)
                curveTo(16.854f, 9.25f, 16.5182f, 9.5858f, 16.5182f, 10.0f)
                verticalLineTo(10.7012f)
                lineTo(15.9108f, 10.3505f)
                curveTo(15.552f, 10.1434f, 15.0934f, 10.2663f, 14.8863f, 10.625f)
                curveTo(14.6791f, 10.9837f, 14.802f, 11.4424f, 15.1608f, 11.6495f)
                lineTo(15.7677f, 11.9999f)
                lineTo(15.1605f, 12.3505f)
                curveTo(14.8018f, 12.5576f, 14.6789f, 13.0163f, 14.886f, 13.375f)
                curveTo(15.0931f, 13.7337f, 15.5518f, 13.8566f, 15.9105f, 13.6495f)
                lineTo(16.5182f, 13.2987f)
                verticalLineTo(14.0f)
                curveTo(16.5182f, 14.4142f, 16.854f, 14.75f, 17.2682f, 14.75f)
                curveTo(17.6824f, 14.75f, 18.0182f, 14.4142f, 18.0182f, 14.0f)
                verticalLineTo(13.2993f)
                lineTo(18.6249f, 13.6495f)
                curveTo(18.9836f, 13.8566f, 19.4423f, 13.7337f, 19.6494f, 13.375f)
                curveTo(19.8565f, 13.0163f, 19.7336f, 12.5576f, 19.3749f, 12.3505f)
                lineTo(18.7677f, 11.9999f)
                lineTo(19.3746f, 11.6495f)
                curveTo(19.7334f, 11.4424f, 19.8563f, 10.9837f, 19.6492f, 10.625f)
                curveTo(19.442f, 10.2663f, 18.9834f, 10.1434f, 18.6246f, 10.3505f)
                lineTo(18.0182f, 10.7006f)
                verticalLineTo(10.0f)
                close()
            }
        }
            .build()
        return _password!!
    }

private var _password: ImageVector? = null
