package dev.chiksmedina.solar.outline.textformatting

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
import dev.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.TextFieldFocus: ImageVector
    get() {
        if (_textFieldFocus != null) {
            return _textFieldFocus!!
        }
        _textFieldFocus = Builder(
            name = "TextFieldFocus", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0f, 1.25f)
                curveTo(15.4142f, 1.25f, 15.75f, 1.5858f, 15.75f, 2.0f)
                verticalLineTo(3.2555f)
                curveTo(16.9594f, 3.2679f, 17.9701f, 3.3093f, 18.8089f, 3.4516f)
                curveTo(19.8369f, 3.626f, 20.6807f, 3.9632f, 21.3588f, 4.6412f)
                curveTo(22.1071f, 5.3896f, 22.4392f, 6.3386f, 22.5969f, 7.511f)
                curveTo(22.75f, 8.6502f, 22.75f, 10.1058f, 22.75f, 11.9435f)
                verticalLineTo(12.0564f)
                curveTo(22.75f, 13.8942f, 22.75f, 15.3498f, 22.5969f, 16.489f)
                curveTo(22.4392f, 17.6614f, 22.1071f, 18.6104f, 21.3588f, 19.3588f)
                curveTo(20.6807f, 20.0368f, 19.8369f, 20.374f, 18.8089f, 20.5484f)
                curveTo(17.9701f, 20.6908f, 16.9594f, 20.7321f, 15.75f, 20.7445f)
                verticalLineTo(22.0f)
                curveTo(15.75f, 22.4142f, 15.4142f, 22.75f, 15.0f, 22.75f)
                curveTo(14.5858f, 22.75f, 14.25f, 22.4142f, 14.25f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(14.25f, 1.5858f, 14.5858f, 1.25f, 15.0f, 1.25f)
                close()
                moveTo(15.75f, 19.2443f)
                verticalLineTo(4.7557f)
                curveTo(16.9362f, 4.7684f, 17.8391f, 4.8085f, 18.558f, 4.9304f)
                curveTo(19.3998f, 5.0733f, 19.9131f, 5.3169f, 20.2981f, 5.7019f)
                curveTo(20.7213f, 6.1251f, 20.975f, 6.7048f, 21.1102f, 7.7108f)
                curveTo(21.2484f, 8.7385f, 21.25f, 10.0932f, 21.25f, 12.0f)
                curveTo(21.25f, 13.9068f, 21.2484f, 15.2615f, 21.1102f, 16.2892f)
                curveTo(20.975f, 17.2952f, 20.7213f, 17.8749f, 20.2981f, 18.2981f)
                curveTo(19.9131f, 18.6831f, 19.3998f, 18.9267f, 18.558f, 19.0696f)
                curveTo(17.8391f, 19.1915f, 16.9362f, 19.2316f, 15.75f, 19.2443f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.9436f, 3.25f)
                lineTo(12.0f, 3.25f)
                curveTo(12.4142f, 3.25f, 12.75f, 3.5858f, 12.75f, 4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.7516f, 8.7385f, 2.75f, 10.0932f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 19.25f, 12.75f, 19.5858f, 12.75f, 20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1059f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 10.1058f, 1.25f, 8.6502f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.8178f, 7.7873f)
                curveTo(7.1178f, 7.7499f, 7.4843f, 7.75f, 7.8838f, 7.75f)
                horizontalLineTo(10.1162f)
                curveTo(10.5157f, 7.75f, 10.8822f, 7.7499f, 11.1822f, 7.7873f)
                curveTo(11.5109f, 7.8283f, 11.8612f, 7.9242f, 12.1624f, 8.1919f)
                curveTo(12.2138f, 8.2375f, 12.2625f, 8.2862f, 12.3081f, 8.3376f)
                curveTo(12.5758f, 8.6388f, 12.6717f, 8.9892f, 12.7127f, 9.3178f)
                curveTo(12.7501f, 9.6178f, 12.7501f, 9.9843f, 12.75f, 10.3838f)
                lineTo(12.75f, 10.425f)
                curveTo(12.75f, 10.8392f, 12.4142f, 11.175f, 12.0f, 11.175f)
                curveTo(11.5858f, 11.175f, 11.25f, 10.8392f, 11.25f, 10.425f)
                curveTo(11.25f, 9.9705f, 11.2486f, 9.6993f, 11.2242f, 9.5035f)
                curveTo(11.1998f, 9.3076f, 10.9965f, 9.2758f, 10.9965f, 9.2758f)
                curveTo(10.8007f, 9.2514f, 10.5295f, 9.25f, 10.075f, 9.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 14.75f, 11.75f, 15.0858f, 11.75f, 15.5f)
                curveTo(11.75f, 15.9142f, 11.4142f, 16.25f, 11.0f, 16.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 16.25f, 6.25f, 15.9142f, 6.25f, 15.5f)
                curveTo(6.25f, 15.0858f, 6.5858f, 14.75f, 7.0f, 14.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(9.25f)
                horizontalLineTo(7.925f)
                curveTo(7.4705f, 9.25f, 7.1993f, 9.2514f, 7.0035f, 9.2758f)
                curveTo(7.0035f, 9.2758f, 6.8002f, 9.3076f, 6.7758f, 9.5035f)
                curveTo(6.7514f, 9.6993f, 6.75f, 9.9705f, 6.75f, 10.425f)
                curveTo(6.75f, 10.8392f, 6.4142f, 11.175f, 6.0f, 11.175f)
                curveTo(5.5858f, 11.175f, 5.25f, 10.8392f, 5.25f, 10.425f)
                lineTo(5.25f, 10.3838f)
                curveTo(5.25f, 9.9843f, 5.2499f, 9.6178f, 5.2873f, 9.3178f)
                curveTo(5.3283f, 8.9892f, 5.4242f, 8.6388f, 5.6919f, 8.3376f)
                curveTo(5.7375f, 8.2862f, 5.7862f, 8.2375f, 5.8376f, 8.1919f)
                curveTo(6.1388f, 7.9242f, 6.4892f, 7.8283f, 6.8178f, 7.7873f)
                close()
            }
        }
            .build()
        return _textFieldFocus!!
    }

private var _textFieldFocus: ImageVector? = null
