package com.chiksmedina.solar.outline.security

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
import com.chiksmedina.solar.outline.SecurityGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.7502f, 10.0f)
                curveTo(12.7502f, 9.5858f, 12.4144f, 9.25f, 12.0002f, 9.25f)
                curveTo(11.586f, 9.25f, 11.2502f, 9.5858f, 11.2502f, 10.0f)
                verticalLineTo(10.7012f)
                lineTo(10.6428f, 10.3505f)
                curveTo(10.2841f, 10.1434f, 9.8254f, 10.2663f, 9.6183f, 10.625f)
                curveTo(9.4112f, 10.9837f, 9.5341f, 11.4424f, 9.8928f, 11.6495f)
                lineTo(10.4997f, 11.9999f)
                lineTo(9.8926f, 12.3505f)
                curveTo(9.5339f, 12.5576f, 9.4109f, 13.0163f, 9.6181f, 13.375f)
                curveTo(9.8252f, 13.7337f, 10.2839f, 13.8566f, 10.6426f, 13.6495f)
                lineTo(11.2502f, 13.2987f)
                verticalLineTo(14.0f)
                curveTo(11.2502f, 14.4142f, 11.586f, 14.75f, 12.0002f, 14.75f)
                curveTo(12.4144f, 14.75f, 12.7502f, 14.4142f, 12.7502f, 14.0f)
                verticalLineTo(13.2993f)
                lineTo(13.3569f, 13.6495f)
                curveTo(13.7156f, 13.8566f, 14.1743f, 13.7337f, 14.3814f, 13.375f)
                curveTo(14.5885f, 13.0163f, 14.4656f, 12.5576f, 14.1069f, 12.3505f)
                lineTo(13.4997f, 11.9999f)
                lineTo(14.1067f, 11.6495f)
                curveTo(14.4654f, 11.4424f, 14.5883f, 10.9837f, 14.3812f, 10.625f)
                curveTo(14.1741f, 10.2663f, 13.7154f, 10.1434f, 13.3567f, 10.3505f)
                lineTo(12.7502f, 10.7006f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.7327f, 9.25f)
                curveTo(7.1469f, 9.25f, 7.4827f, 9.5858f, 7.4827f, 10.0f)
                verticalLineTo(10.7006f)
                lineTo(8.0891f, 10.3505f)
                curveTo(8.4478f, 10.1434f, 8.9065f, 10.2663f, 9.1136f, 10.625f)
                curveTo(9.3207f, 10.9837f, 9.1978f, 11.4424f, 8.8391f, 11.6495f)
                lineTo(8.2322f, 11.9999f)
                lineTo(8.8393f, 12.3505f)
                curveTo(9.1981f, 12.5576f, 9.321f, 13.0163f, 9.1139f, 13.375f)
                curveTo(8.9067f, 13.7337f, 8.4481f, 13.8566f, 8.0893f, 13.6495f)
                lineTo(7.4827f, 13.2993f)
                verticalLineTo(14.0f)
                curveTo(7.4827f, 14.4142f, 7.1469f, 14.75f, 6.7327f, 14.75f)
                curveTo(6.3184f, 14.75f, 5.9827f, 14.4142f, 5.9827f, 14.0f)
                verticalLineTo(13.2987f)
                lineTo(5.375f, 13.6495f)
                curveTo(5.0163f, 13.8566f, 4.5576f, 13.7337f, 4.3505f, 13.375f)
                curveTo(4.1434f, 13.0163f, 4.2663f, 12.5576f, 4.625f, 12.3505f)
                lineTo(5.2322f, 11.9999f)
                lineTo(4.6252f, 11.6495f)
                curveTo(4.2665f, 11.4424f, 4.1436f, 10.9837f, 4.3507f, 10.625f)
                curveTo(4.5578f, 10.2663f, 5.0165f, 10.1434f, 5.3752f, 10.3505f)
                lineTo(5.9827f, 10.7012f)
                verticalLineTo(10.0f)
                curveTo(5.9827f, 9.5858f, 6.3184f, 9.25f, 6.7327f, 9.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0181f, 10.0f)
                curveTo(18.0181f, 9.5858f, 17.6823f, 9.25f, 17.2681f, 9.25f)
                curveTo(16.8539f, 9.25f, 16.5181f, 9.5858f, 16.5181f, 10.0f)
                verticalLineTo(10.7012f)
                lineTo(15.9106f, 10.3505f)
                curveTo(15.5519f, 10.1434f, 15.0932f, 10.2663f, 14.8861f, 10.625f)
                curveTo(14.679f, 10.9837f, 14.8019f, 11.4424f, 15.1606f, 11.6495f)
                lineTo(15.7676f, 11.9999f)
                lineTo(15.1604f, 12.3505f)
                curveTo(14.8017f, 12.5576f, 14.6788f, 13.0163f, 14.8859f, 13.375f)
                curveTo(15.093f, 13.7337f, 15.5517f, 13.8566f, 15.9104f, 13.6495f)
                lineTo(16.5181f, 13.2987f)
                verticalLineTo(14.0f)
                curveTo(16.5181f, 14.4142f, 16.8539f, 14.75f, 17.2681f, 14.75f)
                curveTo(17.6823f, 14.75f, 18.0181f, 14.4142f, 18.0181f, 14.0f)
                verticalLineTo(13.2993f)
                lineTo(18.6247f, 13.6495f)
                curveTo(18.9835f, 13.8566f, 19.4422f, 13.7337f, 19.6493f, 13.375f)
                curveTo(19.8564f, 13.0163f, 19.7335f, 12.5576f, 19.3747f, 12.3505f)
                lineTo(18.7676f, 11.9999f)
                lineTo(19.3745f, 11.6495f)
                curveTo(19.7332f, 11.4424f, 19.8561f, 10.9837f, 19.649f, 10.625f)
                curveTo(19.4419f, 10.2663f, 18.9832f, 10.1434f, 18.6245f, 10.3505f)
                lineTo(18.0181f, 10.7006f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 3.25f)
                curveTo(8.1058f, 3.25f, 6.6502f, 3.25f, 5.511f, 3.4031f)
                curveTo(4.3386f, 3.5608f, 3.3896f, 3.8929f, 2.6412f, 4.6412f)
                curveTo(1.8929f, 5.3896f, 1.5608f, 6.3386f, 1.4031f, 7.511f)
                curveTo(1.25f, 8.6502f, 1.25f, 10.1058f, 1.25f, 11.9436f)
                verticalLineTo(12.0564f)
                curveTo(1.25f, 13.8942f, 1.25f, 15.3498f, 1.4031f, 16.489f)
                curveTo(1.5608f, 17.6614f, 1.8929f, 18.6104f, 2.6412f, 19.3588f)
                curveTo(3.3896f, 20.1071f, 4.3386f, 20.4392f, 5.511f, 20.5969f)
                curveTo(6.6502f, 20.75f, 8.1058f, 20.75f, 9.9435f, 20.75f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 20.75f, 17.3498f, 20.75f, 18.489f, 20.5969f)
                curveTo(19.6614f, 20.4392f, 20.6104f, 20.1071f, 21.3588f, 19.3588f)
                curveTo(22.1071f, 18.6104f, 22.4392f, 17.6614f, 22.5969f, 16.489f)
                curveTo(22.75f, 15.3498f, 22.75f, 13.8942f, 22.75f, 12.0565f)
                verticalLineTo(11.9436f)
                curveTo(22.75f, 10.1059f, 22.75f, 8.6502f, 22.5969f, 7.511f)
                curveTo(22.4392f, 6.3386f, 22.1071f, 5.3896f, 21.3588f, 4.6412f)
                curveTo(20.6104f, 3.8929f, 19.6614f, 3.5608f, 18.489f, 3.4031f)
                curveTo(17.3498f, 3.25f, 15.8942f, 3.25f, 14.0564f, 3.25f)
                horizontalLineTo(9.9436f)
                close()
                moveTo(3.7019f, 5.7019f)
                curveTo(4.1251f, 5.2787f, 4.7048f, 5.025f, 5.7108f, 4.8898f)
                curveTo(6.7385f, 4.7516f, 8.0932f, 4.75f, 10.0f, 4.75f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 4.75f, 17.2615f, 4.7516f, 18.2892f, 4.8898f)
                curveTo(19.2952f, 5.025f, 19.8749f, 5.2787f, 20.2981f, 5.7019f)
                curveTo(20.7213f, 6.1251f, 20.975f, 6.7048f, 21.1102f, 7.7108f)
                curveTo(21.2484f, 8.7385f, 21.25f, 10.0932f, 21.25f, 12.0f)
                curveTo(21.25f, 13.9068f, 21.2484f, 15.2615f, 21.1102f, 16.2892f)
                curveTo(20.975f, 17.2952f, 20.7213f, 17.8749f, 20.2981f, 18.2981f)
                curveTo(19.8749f, 18.7213f, 19.2952f, 18.975f, 18.2892f, 19.1102f)
                curveTo(17.2615f, 19.2484f, 15.9068f, 19.25f, 14.0f, 19.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 19.25f, 6.7385f, 19.2484f, 5.7108f, 19.1102f)
                curveTo(4.7048f, 18.975f, 4.1251f, 18.7213f, 3.7019f, 18.2981f)
                curveTo(3.2787f, 17.8749f, 3.025f, 17.2952f, 2.8898f, 16.2892f)
                curveTo(2.7516f, 15.2615f, 2.75f, 13.9068f, 2.75f, 12.0f)
                curveTo(2.75f, 10.0932f, 2.7516f, 8.7385f, 2.8898f, 7.7108f)
                curveTo(3.025f, 6.7048f, 3.2787f, 6.1251f, 3.7019f, 5.7019f)
                close()
            }
        }
            .build()
        return _password!!
    }

private var _password: ImageVector? = null
