package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.LetterUnread: ImageVector
    get() {
        if (_letterUnread != null) {
            return _letterUnread!!
        }
        _letterUnread = Builder(
            name = "LetterUnread", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.0f, 2.75f)
                curveTo(17.7574f, 2.75f, 16.75f, 3.7574f, 16.75f, 5.0f)
                curveTo(16.75f, 6.2426f, 17.7574f, 7.25f, 19.0f, 7.25f)
                curveTo(20.2426f, 7.25f, 21.25f, 6.2426f, 21.25f, 5.0f)
                curveTo(21.25f, 3.7574f, 20.2426f, 2.75f, 19.0f, 2.75f)
                close()
                moveTo(15.25f, 5.0f)
                curveTo(15.25f, 2.9289f, 16.9289f, 1.25f, 19.0f, 1.25f)
                curveTo(21.0711f, 1.25f, 22.75f, 2.9289f, 22.75f, 5.0f)
                curveTo(22.75f, 7.0711f, 21.0711f, 8.75f, 19.0f, 8.75f)
                curveTo(16.9289f, 8.75f, 15.25f, 7.0711f, 15.25f, 5.0f)
                close()
                moveTo(9.9436f, 3.25f)
                lineTo(13.0f, 3.25f)
                curveTo(13.4142f, 3.25f, 13.75f, 3.5858f, 13.75f, 4.0f)
                curveTo(13.75f, 4.4142f, 13.4142f, 4.75f, 13.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.7516f, 8.7385f, 2.75f, 10.0932f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 19.25f, 17.2615f, 19.2484f, 18.2892f, 19.1102f)
                curveTo(19.2952f, 18.975f, 19.8749f, 18.7213f, 20.2981f, 18.2981f)
                curveTo(20.7213f, 17.8749f, 20.975f, 17.2952f, 21.1102f, 16.2892f)
                curveTo(21.2484f, 15.2615f, 21.25f, 13.9068f, 21.25f, 12.0f)
                curveTo(21.25f, 11.6271f, 21.2527f, 11.3546f, 21.255f, 11.1204f)
                curveTo(21.2587f, 10.7412f, 21.2615f, 10.4622f, 21.2502f, 10.0191f)
                curveTo(21.2397f, 9.605f, 21.5669f, 9.2608f, 21.9809f, 9.2502f)
                curveTo(22.395f, 9.2397f, 22.7392f, 9.5669f, 22.7498f, 9.9809f)
                curveTo(22.7616f, 10.447f, 22.7586f, 10.7652f, 22.7547f, 11.1672f)
                curveTo(22.7525f, 11.4012f, 22.75f, 11.6635f, 22.75f, 12.0f)
                verticalLineTo(12.0564f)
                curveTo(22.75f, 13.8942f, 22.75f, 15.3498f, 22.5969f, 16.489f)
                curveTo(22.4392f, 17.6614f, 22.1071f, 18.6104f, 21.3588f, 19.3588f)
                curveTo(20.6104f, 20.1071f, 19.6614f, 20.4392f, 18.489f, 20.5969f)
                curveTo(17.3498f, 20.75f, 15.8942f, 20.75f, 14.0564f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 10.1058f, 1.25f, 8.6502f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
                moveTo(5.4238f, 7.5199f)
                curveTo(5.689f, 7.2017f, 6.1619f, 7.1587f, 6.4801f, 7.4238f)
                lineTo(8.639f, 9.2229f)
                curveTo(9.572f, 10.0004f, 10.2197f, 10.5384f, 10.7666f, 10.8901f)
                curveTo(11.2959f, 11.2306f, 11.6549f, 11.3449f, 12.0f, 11.3449f)
                curveTo(12.3451f, 11.3449f, 12.7041f, 11.2306f, 13.2334f, 10.8901f)
                curveTo(13.7803f, 10.5384f, 14.428f, 10.0004f, 15.361f, 9.2229f)
                curveTo(15.6792f, 8.9577f, 16.1521f, 9.0007f, 16.4173f, 9.3189f)
                curveTo(16.6824f, 9.6371f, 16.6395f, 10.1101f, 16.3212f, 10.3752f)
                lineTo(16.2837f, 10.4066f)
                curveTo(15.3973f, 11.1452f, 14.6789f, 11.7439f, 14.0448f, 12.1517f)
                curveTo(13.3843f, 12.5765f, 12.7411f, 12.8449f, 12.0f, 12.8449f)
                curveTo(11.2589f, 12.8449f, 10.6157f, 12.5765f, 9.9552f, 12.1517f)
                curveTo(9.3211f, 11.7439f, 8.6027f, 11.1452f, 7.7164f, 10.4066f)
                lineTo(5.5199f, 8.5762f)
                curveTo(5.2017f, 8.311f, 5.1587f, 7.8381f, 5.4238f, 7.5199f)
                close()
            }
        }
            .build()
        return _letterUnread!!
    }

private var _letterUnread: ImageVector? = null
